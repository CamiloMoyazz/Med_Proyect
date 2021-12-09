package com.example.medexpress

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView

class medicamentos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicamentos)

        var atras = findViewById<ImageButton>(R.id.back)
        var buscar = findViewById<ImageButton>(R.id.busIcon)
        var home = findViewById<ImageView>(R.id.homeMed)
        var analgesicos = findViewById<Button>(R.id.analge)
        var busqueda = findViewById<EditText>(R.id.buscar)
        var antiinfec = findViewById<Button>(R.id.anti)
        var muco = findViewById<Button>(R.id.muco)
        var laxante = findViewById<Button>(R.id.laxante)
        var antipire = findViewById<Button>(R.id.piretico)


        buscar.setOnClickListener{
            val palabra = busqueda.text.toString()
            when {
                palabra == "" -> {
                    antiinfec.visibility = View.VISIBLE
                    analgesicos.visibility = View.VISIBLE
                    muco.visibility = View.VISIBLE
                    laxante.visibility = View.VISIBLE
                    antipire.visibility = View.VISIBLE
                }
                palabra.contains("ana",ignoreCase = true) -> {
                    analgesicos.visibility = View.VISIBLE
                    antiinfec.visibility = View.INVISIBLE
                    muco.visibility = View.INVISIBLE
                    laxante.visibility = View.INVISIBLE
                    antipire.visibility = View.INVISIBLE
                }
                palabra.contains("inflamatorio",ignoreCase = true) -> {
                    analgesicos.visibility = View.VISIBLE
                    antiinfec.visibility = View.INVISIBLE
                    muco.visibility = View.INVISIBLE
                    laxante.visibility = View.INVISIBLE
                    antipire.visibility = View.INVISIBLE
                }
                palabra.contains("muco",ignoreCase = true) -> {
                    muco.visibility = View.VISIBLE
                    antiinfec.visibility = View.INVISIBLE
                    analgesicos.visibility = View.INVISIBLE
                    laxante.visibility = View.INVISIBLE
                    antipire.visibility = View.INVISIBLE
                }
                palabra.contains("viral", ignoreCase = true) ->{
                    antiinfec.visibility = View.VISIBLE
                    analgesicos.visibility = View.INVISIBLE
                    muco.visibility = View.INVISIBLE
                    laxante.visibility = View.INVISIBLE
                    antipire.visibility = View.INVISIBLE
                }
                palabra.contains("anti",ignoreCase = true)->{
                    antiinfec.visibility = View.VISIBLE
                    analgesicos.visibility = View.VISIBLE
                    muco.visibility = View.VISIBLE
                    laxante.visibility = View.VISIBLE
                    antipire.visibility = View.VISIBLE
                }
            }
        }



        home.setOnClickListener{
            finish()
        }

        atras.setOnClickListener{
            finish()
        }

        analgesicos.setOnClickListener{
            var ventana2 = Intent(this,medicamentosLista::class.java)
            startActivity(ventana2)
        }
    }
}