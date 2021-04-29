package com.istea.tpenclase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.istea.tpenclase.clases.Users

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button  = findViewById(R.id.m_btn)
        val lblMain : TextView = findViewById(R.id.lbl_Main)
        val ingresoUser : EditText = findViewById(R.id.m_EditText)
        val ingresoPass : EditText = findViewById(R.id.m_Pass)

        val recepcionista: Users =  Users("recepcion", "1234")
        val pedro: Users =  Users("veterinario1", "1234")
        val juan: Users =  Users("veterinario2", "1234")
        val lista = listOf<Users>(recepcionista, pedro, juan)

        btn.setOnClickListener {
            for (i in lista){
                if (ingresoUser.text.toString().toLowerCase().equals(recepcionista.usuario.toString())){
                    if(ingresoPass.text.toString().toLowerCase().equals(recepcionista.pass.toString())){
                        var intent : Intent = Intent(this, RecepcionistaActivity::class.java)
                        startActivity(intent)
                    }
                }else if(ingresoUser.text.toString().toLowerCase().equals(pedro.usuario.toString())){
                    if(ingresoPass.text.toString().toLowerCase().equals(pedro.pass.toString())){
                        var intent2 : Intent = Intent(this, PedroActitivity::class.java)
                        startActivity(intent2)
                    }
                }else if(ingresoUser.text.toString().toLowerCase().equals(juan.usuario.toString())){
                    if(ingresoPass.text.toString().toLowerCase().equals(juan.pass.toString())){
                        var intent3 : Intent = Intent(this, JuanActivity::class.java)
                        startActivity(intent3)
                    }
                }else
                    Toast.makeText(this, "Usuario o Contrasena mal ingresada", Toast.LENGTH_LONG).show()
            }

        }


    }
}