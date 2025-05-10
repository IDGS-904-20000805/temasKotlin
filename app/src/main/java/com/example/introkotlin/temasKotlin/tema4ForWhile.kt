package com.example.introkotlin.temasKotlin

/*
 Range= ..

 1..4 = 1,2,3,4
tenemos cuatro elementos apartir del uno al cuatro

1..<4= 1,2,3
no tocaria el 4

4 downTo 1= 4,3,2,1
es decendiente

1..5 step 2 = 1,3,5
Es incremento de dos en dos por el "Step"

'a'...'f' = 'a'....'f' se cuentan los char desde el 'a' hasta la 'f'
 */


// ejemplo usando for

fun main(){

    for (n in 1..5){ // lo guardamos en n
        print(n) // imprimimos lo guardado en n
    }

    val figuras = listOf("cuadrado", "triangulo","circulo")
    for (figura in figuras){ //no es un for each(segun el geras)
        print(figura)
    }

    //while
    var numero = 0
    while (numero<5){
        print(numero)
        numero++
    }
}