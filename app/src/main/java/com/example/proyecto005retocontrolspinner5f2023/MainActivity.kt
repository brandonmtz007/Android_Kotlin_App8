package com.example.proyecto005retocontrolspinner5f2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val tv1=findViewById<TextView>(R.id.tv1)
        val button=findViewById<Button>(R.id.button)
        val spinner=findViewById<Spinner>(R.id.spinner)
        val lista = arrayOf("Mexico", "Estados Unidos", "Canada", "No esta")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista)
        spinner.adapter = adaptador1
        button.setOnClickListener {
            when (spinner.selectedItem.toString()) {
                "Mexico" -> tv1.text = "Bienvenido: ${et1.text.toString()+" " + et2.text.toString()+ " eres de Mexico"}"
                "Estados Unidos" -> tv1.text = "Bienvenido: ${et1.text.toString()+" " + et2.text.toString()+ " eres de Estados Unidos"}"
                "Canada" -> tv1.text = "Bienvenido: ${et1.text.toString()+" " + et2.text.toString()+ " eres de canada"}"
                "No esta" -> tv1.text = "Bienvenido: ${et1.text.toString()+" " + et2.text.toString()+" no se encontraba tu pais"}"
            }
        }
    }
}