package com.example.introkotlin.temasKotlin

fun main() {
    print("De cuantos pisos quieres la piramide ")
    val filas = readln().toInt()

    var i = 1
    do {
        if (filas == 0) {
            println("Programa terminado")
            break
        }
        var j = 1
        do {
            print("*")
            j++
        } while (j <= i)
        println()
        i++
    } while (i <= filas)
}