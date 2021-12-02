package com.example.medexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnMed = findViewById<Button>(R.id.med)
        var btnOpi = findViewById<Button>(R.id.opi)
        var btnSobre = findViewById<Button>(R.id.sobre)

        btnMed.setOnClickListener{
            val ventana2 = Intent(this,medicamentos::class.java)
            startActivity(ventana2)
        }
        btnOpi.setOnClickListener{
            val ventana3 = Intent(this,tuOpinion::class.java)
            startActivity(ventana3)
        }
        btnSobre.setOnClickListener{
            val ventana4 = Intent(this,sobreNosotros::class.java)
            startActivity(ventana4)
        }


    }
}