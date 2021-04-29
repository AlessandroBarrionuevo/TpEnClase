package com.istea.tpenclase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.istea.tpenclase.clases.Animales
import com.istea.tpenclase.clases.Conejo
import com.istea.tpenclase.clases.Gato
import com.istea.tpenclase.clases.Perro
import kotlin.collections.arrayListOf as arrayList

class RecepcionistaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recepcionista)

        val btn: Button = findViewById(R.id.rIngresarDatos)
        val lblMain : TextView = findViewById(R.id.rLbl)
        val nombre : EditText = findViewById(R.id.rNombre)
        val edad : EditText = findViewById(R.id.rEdad)
        val causaAtencion : EditText = findViewById(R.id.rCausaAtencion)
        val tipo : Spinner = findViewById(R.id.rRaza)
        val raza : EditText  = findViewById(R.id.rCausaAtencion)//Cambiar

        var pacientes = arrayList<Animales>()
        lateinit var nuevoPaciente: Animales


        var tipoPacientes = arrayList("Conejo","Perro","Gato")

        tipo.adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, tipoPacientes)

        btn.setOnClickListener {
           tipo.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
               override fun onItemSelected(
                   parent: AdapterView<*>?,
                   view: View?,
                   position: Int,
                   id: Long
               ) {
                   if(tipoPacientes[position] == "Conejo"){
                       nuevoPaciente = Conejo(nombre.text.toString()
                           ,edad.text.toString(),"Conejo", raza.text.toString()
                           , causaAtencion.text.toString())
                       pacientes.add(nuevoPaciente)
                       Toast.makeText(this@RecepcionistaActivity, tipoPacientes[position], Toast.LENGTH_LONG).show()

                   }else if (tipoPacientes[position] == "Perro") {
                            nuevoPaciente = Perro(
                           nombre.text.toString(),
                           edad.text.toString(),
                           "Conejo",
                           raza.text.toString(),
                           causaAtencion.text.toString())
                       pacientes.add(nuevoPaciente)
                       Toast.makeText(this@RecepcionistaActivity, tipoPacientes[position], Toast.LENGTH_LONG).show()

                   }else if(tipoPacientes[position] == "Gato"){
                       nuevoPaciente = Gato(
                           nombre.text.toString(),
                           edad.text.toString(),
                           "Conejo",
                           raza.text.toString(),
                           causaAtencion.text.toString())
                       pacientes.add(nuevoPaciente)
                       Toast.makeText(this@RecepcionistaActivity, tipoPacientes[position], Toast.LENGTH_LONG).show()

                   }
               }

               override fun onNothingSelected(parent: AdapterView<*>?) {
                   TODO("Not yet implemented")
               }



           }

            val intent: Intent = Intent(this@RecepcionistaActivity, JuanActivity::class.java)
            intent.putExtra("pacientes", pacientes)
            startActivity(intent)
        }

    }
}