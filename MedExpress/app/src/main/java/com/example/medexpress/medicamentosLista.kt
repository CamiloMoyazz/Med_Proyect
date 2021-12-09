package com.example.medexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class medicamentosLista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicamentos_lista)

        var atras = findViewById<ImageButton>(R.id.back2)
        var home = findViewById<ImageView>(R.id.homeMed1)


        atras.setOnClickListener{
            finish()
        }
        home.setOnClickListener{
            finish()
        }

        val antiInfla = mutableListOf("Aspirina","Enantyum","Flurbibuprofeno","Ibuprofeno","Ketoprofeno","Naproxeno","Paracetamol","Piroxicam")
        val l1 = findViewById<TextView>(R.id.l1)
        val l2 = findViewById<TextView>(R.id.l2)
        val l3 = findViewById<TextView>(R.id.l3)
        val l4 = findViewById<TextView>(R.id.l4)
        val l5 = findViewById<TextView>(R.id.l5)
        val l6 = findViewById<TextView>(R.id.l6)
        val l7 = findViewById<TextView>(R.id.l7)
        val l8 = findViewById<TextView>(R.id.l8)

        //BOTONES
        val bt1 = findViewById<Button>(R.id.bt1)
        val bt2 = findViewById<Button>(R.id.bt2)
        val bt3 = findViewById<Button>(R.id.bt3)
        val bt4 = findViewById<Button>(R.id.bt4)
        val bt5 = findViewById<Button>(R.id.bt5)
        val bt6 = findViewById<Button>(R.id.bt6)
        val bt7 = findViewById<Button>(R.id.bt7)
        val bt8 = findViewById<Button>(R.id.bt8)

        //Sett Valores
        l1.text = antiInfla[0]
        l1.visibility = View.VISIBLE
        bt1.visibility = View.VISIBLE

        l2.text = antiInfla[1]
        l2.visibility = View.VISIBLE
        bt2.visibility = View.VISIBLE

        l3.text = antiInfla[2]
        l3.visibility = View.VISIBLE
        bt3.visibility = View.VISIBLE

        l4.text = antiInfla[3]
        l4.visibility = View.VISIBLE
        bt4.visibility = View.VISIBLE

        l5.text = antiInfla[4]
        l5.visibility = View.VISIBLE
        bt5.visibility = View.VISIBLE

        l6.text = antiInfla[5]
        l6.visibility = View.VISIBLE
        bt6.visibility = View.VISIBLE

        l7.text = antiInfla[6]
        l7.visibility = View.VISIBLE
        bt7.visibility = View.VISIBLE

        l8.text = antiInfla[7]
        l8.visibility = View.VISIBLE
        bt8.visibility = View.VISIBLE

        //Set MedName
        bt1.setOnClickListener{
            Intent(this,medicamento::class.java).also {
                it.putExtra("MED_NAME","Aspirina")
                startActivity(it)
            }

        }
        bt2.setOnClickListener{
            Intent(this,medicamento::class.java).also {
                it.putExtra("MED_NAME","Enantyum")
                startActivity(it)
            }

        }
        bt3.setOnClickListener{
            Intent(this,medicamento::class.java).also {
                it.putExtra("MED_NAME","Flurbibuprofeno")
                startActivity(it)
            }

        }
        bt4.setOnClickListener{
            Intent(this,medicamento::class.java).also {
                it.putExtra("MED_NAME","Ibuprofeno")
                startActivity(it)
            }

        }
        bt5.setOnClickListener{
            Intent(this,medicamento::class.java).also {
                it.putExtra("MED_NAME","Ketoprofeno")
                startActivity(it)
            }

        }
        bt6.setOnClickListener{
            Intent(this,medicamento::class.java).also {
                it.putExtra("MED_NAME","Naproxeno")
                startActivity(it)
            }

        }
        bt7.setOnClickListener{
            Intent(this,medicamento::class.java).also {
                it.putExtra("MED_NAME","Paracetamol")
                startActivity(it)
            }

        }
        bt8.setOnClickListener{
            Intent(this,medicamento::class.java).also {
                it.putExtra("MED_NAME","Piroxicam")
                startActivity(it)
            }

        }




    }
}