package com.istea.tpenclase.clases

class Conejo(
    override var nombre: String,
    override var edad: String,
    override var tipo: String,
    override var raza: String,
    override var causaAtencion: String,
    override var Diagnostico: String= "",
    override var Causas: String= "",
    override var Medicamentos: String= "",
    override var Tratamiento: String= "",
    override var Reposo: String= ""
) : Animales() {


}