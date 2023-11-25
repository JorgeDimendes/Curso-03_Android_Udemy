package com.jordev.convidado.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class GuestDataBase(context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {

        companion object{
            private const val NAME = "guestdb"
            private const val VERSION = 1
        }

    override fun onCreate(db: SQLiteDatabase) {
        //Criação do banco
        db.execSQL("CREATE TABLE Guest (" +
                " id integer primary key autoincrement, " +
                "name text, " +
                "presence integer);")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {

    }
    //25/11/2023 16:28

}