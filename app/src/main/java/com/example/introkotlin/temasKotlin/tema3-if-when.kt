package com.example.introkotlin.temasKotlin

fun main(){
    val d: Int
    val check = true

    if (check){
        d=1
    }else{
        d=2
    }
    print(d)

    val d2 = if(check)1 else 2
    println(d2)

    println("____________________________________________")
    println("Ingrese el sueldo del empleado:")
    val sueldo = readln().toDouble()
    if (sueldo > 3000){
        print("debe pagar impuestos")
    }


    //when
    val obj = "hello"

    when(obj) {

     "i" -> println("Uno")
     "Hello" -> println("Dos")

     else -> println("No hay coincidencias")

    }

}