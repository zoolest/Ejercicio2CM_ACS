package com.example.ejercicio2cm_acs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    //private  val numeros = mutableListof
    private val numeros:MutableList<Int> = mutableListOf()
    val lvDatos = findViewById<ListView>(R.id.ListView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nums= mutableListOf("Juan")
    }


}