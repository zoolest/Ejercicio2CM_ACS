package com.example.ejercicio2cm_acs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

private lateinit var etLista: EditText

class MainActivity : AppCompatActivity() {

    private val numeros: MutableList<Int>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etLista = findViewById(R.id.etLista)
        val arrayAdapter:ArrayAdapter<*>
        val nums= mutableListOf<Int>()
        val lvDatos = findViewById<ListView>(R.id.lvDatos)
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        val btnOrdenar = findViewById<Button>(R.id.btnOrdenar)

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,nums)
        lvDatos.adapter = arrayAdapter

        btnAgregar.setOnClickListener {
            val num= Integer.parseInt(etLista.text.toString())
            nums.add(num)
        }
        btnOrdenar.setOnClickListener{
            nums.sort()
            val arrayAdapter:ArrayAdapter<*>
            arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,nums)
            lvDatos.adapter = arrayAdapter
        }


    }


    /*
    private fun aceptar{
        val lvDatos=findViewById<ListView>(R.id.lvDatos)
        val arrayAdapter:ArrayAdapter<Int>
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,nums)
        lvDatos.adapter = arrayAdapter
    }
    private fun ordenar{
        val switch=findViewById<>()
    }*/

}