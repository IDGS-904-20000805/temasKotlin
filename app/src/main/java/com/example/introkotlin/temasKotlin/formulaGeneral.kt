package com.example.introkotlin.temasKotlin

fun calcularFormulaGeneral() {
    println("CALCULADORA DE FORMULA GENERAL ax^2 + bx + c = 0")


    print("Ingrese a:")
    val a = readln().toDoubleOrNull() ?: 0.0 //Resulta que kotlin para hacer matematicas tiene que declararse asi para evitar null

    print("Ingrese b:")
    val b = readln().toDoubleOrNull() ?: 0.0

    print("Ingrese c:")
    val c = readln().toDoubleOrNull() ?: 0.0


    if (a == 0.0) {
        println("El valor de 'a' divide no puede ser 0")

    }
    val raiz = b * b - 4 * a * c
    if (raiz < 0) {
        println("Error, la raiz es negativa")
    }
    val x1 = (-b + Math.sqrt(raiz)) / (2 * a)
    val x2 = (-b - Math.sqrt(raiz)) / (2 * a)


    println("resultados:")
    println("x1 = %.2f".format(x1)) // busque como dar formato para mostrar los decimales
    println("x2 = %.2f".format(x2))
}

fun main() {
    calcularFormulaGeneral()
}

