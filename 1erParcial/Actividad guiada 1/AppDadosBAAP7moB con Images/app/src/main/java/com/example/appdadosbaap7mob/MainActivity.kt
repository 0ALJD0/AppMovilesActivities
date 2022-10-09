package com.example.appdadosbaap7mob

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        //Mostrando la imagen correspondiente luego de girar el dado
        val imagenDado: ImageView = findViewById(R.id.imageView)
        //Dependiendo del valor obtenido en la val "girarDado"
        // se mostrará una imagen u otra
        when (girarDado) {
            1 -> imagenDado.setImageResource(R.drawable.dicee_1)
            2 -> imagenDado.setImageResource(R.drawable.dice_2)
            3 -> imagenDado.setImageResource(R.drawable.dice_3)
            4 -> imagenDado.setImageResource(R.drawable.dice_4)
            5 -> imagenDado.setImageResource(R.drawable.dice_5)
            6 -> imagenDado.setImageResource(R.drawable.dice_6)
        }
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
