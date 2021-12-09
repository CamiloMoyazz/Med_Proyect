package com.example.medexpress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class medicamento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicamento)

        val medName = intent.getStringExtra("MED_NAME")
        var nombreMed = findViewById<TextView>(R.id.nombreMed)
        var img = findViewById<ImageView>(R.id.foto)
        var atras = findViewById<ImageButton>(R.id.back3)
        var home = findViewById<ImageView>(R.id.homeMed2)

        //PRECIOS
        var v1 = findViewById<TextView>(R.id.v1)
        var v2 = findViewById<TextView>(R.id.v2)
        var v3 = findViewById<TextView>(R.id.v3)
        var v4 = findViewById<TextView>(R.id.v4)

        //FARMACIAS
        var f1 = findViewById<TextView>(R.id.f1)
        var f2 = findViewById<TextView>(R.id.f2)
        var f3 = findViewById<TextView>(R.id.f3)
        var f4 = findViewById<TextView>(R.id.f4)

        val farmacias = mutableListOf("SIMI","SALCOBRAND","CRUZ VERDE","AHUMADA")
        val aspiP = mutableListOf("$998","$1250","$1407","$1490")
        val enanP = mutableListOf("$690","$1250","$1400","$1500")
        val flurP = mutableListOf("$850","$1120","$1350","$1400")
        val ibuP = mutableListOf("$590","$1050","$1200","$1250")
        val ketoP = mutableListOf("$1000","$1450","$1480","$1590")
        val naproP = mutableListOf("$900","$1450","$1520","$1690")
        val paraP = mutableListOf("$890","$990","$1120","$1390")
        val piroP = mutableListOf("$1100","$1290","$1500","$1760")

        if(medName.equals("Aspirina",ignoreCase = true)){
            nombreMed.text = medName
            img.setImageResource(R.drawable.aspi)
            v1.text = aspiP[0]
            v2.text = aspiP[1]
            v3.text = aspiP[2]
            v4.text = aspiP[3]
            f1.text = farmacias[0]
            f2.text = farmacias[1]
            f3.text = farmacias[2]
            f4.text = farmacias[3]
        }else if(medName.equals("Enantyum",ignoreCase = true)){
            nombreMed.text = medName
            img.setImageResource(R.drawable.enan)
            v1.text = enanP[0]
            v2.text = enanP[1]
            v3.text = enanP[2]
            v4.text = enanP[3]
            f1.text = farmacias[0]
            f2.text = farmacias[1]
            f3.text = farmacias[2]
            f4.text = farmacias[3]
        }else if(medName.equals("Flurbibuprofeno",ignoreCase = true)){
            nombreMed.text = medName
            img.setImageResource(R.drawable.flur)
            v1.text = flurP[0]
            v2.text = flurP[1]
            v3.text = flurP[2]
            v4.text = flurP[3]
            f1.text = farmacias[1]
            f2.text = farmacias[0]
            f3.text = farmacias[2]
            f4.text = farmacias[3]
        }else if(medName.equals("Ibuprofeno",ignoreCase = true)){
            nombreMed.text = medName
            img.setImageResource(R.drawable.ibu)
            v1.text = ibuP[0]
            v2.text = ibuP[1]
            v3.text = ibuP[2]
            v4.text = ibuP[3]
            f1.text = farmacias[0]
            f2.text = farmacias[1]
            f3.text = farmacias[2]
            f4.text = farmacias[3]
        }else if(medName.equals("Ketoprofeno",ignoreCase = true)){
            nombreMed.text = medName
            img.setImageResource(R.drawable.keto)
            v1.text = ketoP[0]
            v2.text = ketoP[1]
            v3.text = ketoP[2]
            v4.text = ketoP[3]
            f1.text = farmacias[1]
            f2.text = farmacias[0]
            f3.text = farmacias[3]
            f4.text = farmacias[2]
        }else if(medName.equals("Naproxeno",ignoreCase = true)){
            nombreMed.text = medName
            img.setImageResource(R.drawable.napro)
            v1.text = naproP[0]
            v2.text = naproP[1]
            v3.text = naproP[2]
            v4.text = naproP[3]
            f1.text = farmacias[0]
            f2.text = farmacias[1]
            f3.text = farmacias[3]
            f4.text = farmacias[2]
        }else if(medName.equals("Paracetamol",ignoreCase = true)){
            nombreMed.text = medName
            img.setImageResource(R.drawable.para)
            v1.text = paraP[0]
            v2.text = paraP[1]
            v3.text = paraP[2]
            v4.text = paraP[3]
            f1.text = farmacias[0]
            f2.text = farmacias[1]
            f3.text = farmacias[3]
            f4.text = farmacias[2]
        }else if(medName.equals("Piroxicam",ignoreCase = true)){
            nombreMed.text = medName
            img.setImageResource(R.drawable.piro)
            v1.text = piroP[0]
            v2.text = piroP[1]
            v3.text = piroP[2]
            v4.text = piroP[3]
            f1.text = farmacias[0]
            f2.text = farmacias[1]
            f3.text = farmacias[2]
            f4.text = farmacias[3]
        }else{

        }

        atras.setOnClickListener {
            finish()
        }

        home.setOnClickListener {
            finish()
        }
    }
}