package com.istea.tpenclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.istea.tpenclase.clases.Animales

class JuanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juan)

        val btn: Button = findViewById(R.id.jEnviar)
        val lbl: TextView = findViewById(R.id.jLabel)
        lateinit var lista: ArrayList<Animales>
        lista = intent.getSerializableExtra("pacientes") as ArrayList<Animales>

    }
}