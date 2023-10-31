package com.jordev.convidado.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.jordev.convidado.R
import com.jordev.convidado.databinding.ActivityGuestFormBinding
import com.jordev.convidado.viewmodel.GuestFormViewModel

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityGuestFormBinding
    private lateinit var viewModel: GuestFormViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuestFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtém uma referência ao objeto ActionBar
        val actionBar = supportActionBar

        // Oculta o toolbar
        actionBar?.hide()

        viewModel = ViewModelProvider(this).get(GuestFormViewModel::class.java)

        binding.buttonSave.setOnClickListener(this)
        binding.radioPresent.isChecked = true //Deixar marcado por Padrão a caixa Presente
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_save){

        }
    }

}