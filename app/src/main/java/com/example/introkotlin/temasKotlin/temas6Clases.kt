package com.example.introkotlin.temasKotlin

class usuarios(){
    val materia: String = ""
}


class usuarios2(val id:Int, val nombre:String){
    val materia : String=""
    fun hola(){
        print("Hola")
    }

}

fun main(){

    val alumno = usuarios();
    val alumno2 = usuarios2(1, "Carlos")

    print(alumno2.id)
    print(alumno2.nombre)
    alumno2.hola()
}