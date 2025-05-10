fun calculardoraBasica() {
    var a = 0.0
    var b = 0.0


    println("1RO SE REALIZARA LA SUMA")
    print("ELIGA UN NUMERO: ")
    a = readln().toDouble()
    print("AHORA ELIJA EL SEGUNDO NUMERO: ")
    b = readln().toDouble()
    println("EL RESULTADO ES: ${a + b}\n")

    println("2DO SE REALIZARA LA RESTA")
    print("ELIGA UN NUMERO: ")
    a = readln().toDouble()
    print("AHORA ELIJA EL SEGUNDO NUMERO: ")
    b = readln().toDouble()
    println("EL RESULTADO ES: ${a - b}\n")


    println("3RO SE REALIZARA LA MULTIPLICACION")
    print("ELIGA UN NUMERO: ")
    a = readln().toDouble()
    print("AHORA ELIJA EL SEGUNDO NUMERO: ")
    b = readln().toDouble()
    println("EL RESULTADO ES: ${a * b}\n")

    
    println("POR ULTIMO SE REALIZARA LA DIVISION")
    print("ELIGA UN NUMERO (NO CERO): ")
    a =readln().toDouble()
    print("AHORA ELIJA EL SEGUNDO NUMERO (NO CERO): ")
    b =readln().toDouble()
    println("EL RESULTADO ES: ${a / b}")
}

fun main() {
    calculardoraBasica()
}