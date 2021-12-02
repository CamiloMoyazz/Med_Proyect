package com.example.medexpress

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class medicamentos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicamentos)

        var atras = findViewById<ImageButton>(R.id.back)
        var home = findViewById<ImageView>(R.id.homeMed)
        var analgesicos = findViewById<Button>(R.id.analge)

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