package com.example.motivacion.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.motivacion.infra.MotivacionConstants
import com.example.motivacion.infra.SecurityPreferences
import com.example.motivacion.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        handleSave()
        verifyUserName()

    }

    private fun verifyUserName(){
        val name = SecurityPreferences(this).getString(MotivacionConstants.key.USER_NAME)
        if(!name.isEmpty()){
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
    private fun handleSave(){
        binding.buttonSave.setOnClickListener {
            val editName = binding.editName.text.toString()
            if(editName.isEmpty()){
                Toast.makeText(this, "Informe seu nome", Toast.LENGTH_SHORT).show()
            } else{
                SecurityPreferences(this).storeString(MotivacionConstants.key.USER_NAME, editName)

                Toast.makeText(this, "$editName Seja bem vindo", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }
    }
}