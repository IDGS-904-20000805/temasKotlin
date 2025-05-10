package com.example.introkotlin.temasKotlin

fun saludo(){

    print("Hola mundo")
}


fun suma( a:Int,  b:Int){
    print("la suma de $a + $b es ${a+b}")
}

fun resta(a:Int, b:Int):Int{ //para asegurar que la funcion regrese un entero
    return a-b
}

//resta de una sola linea
fun resta2(a:Int, b:Int)=a-b

fun main(){

    saludo()
    suma(1, 2)
}


