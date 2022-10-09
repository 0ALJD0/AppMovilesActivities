package com.example.appdadosbaap7mob

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
//Arce Ponce Bryan Alejandro
//he credo este codigo en el cual el usuario puede girar un dado de 6 lados
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val daleVuelta: Button = findViewById(R.id.button)
        daleVuelta.setOnClickListener{ darVuelta() }
    }
    //Funcion que gira el dado y  muestra el resultado en la pantalla
    private fun darVuelta() {
        //creacion del dado y girarlo
        val dadoOverPower = Dado(6)
        val girarDado = dadoOverPower.darleVuelta()
        //Mostrando el valor luego de girar el dado
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = girarDado.toString()
    }
}
// Clase Dado en la que le damos el función de girar al dado
class Dado (private val lados:Int){
    //funcion que consiste en crear una serie de numeros que dependa del numero de lados
    //y retorne uno de esos números de forma aleatoria
    fun darleVuelta(): Int{
        return (1..lados).random()
    }
}
