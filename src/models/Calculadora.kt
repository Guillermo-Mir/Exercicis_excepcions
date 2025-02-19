package models

class Calculadora {
    fun operacions(operador: String, num1: Int, num2: Int) {
        when (operador) {
            "+" -> println("La suma es: ${num1 + num2}")
            "-" -> println("La resta es: ${num1 - num2}")
            "*" -> println("La multiplicacio es: ${num1 * num2}")
            "/" -> {
                try {
                    val division = num1 / num2
                    println("La divisio es: $division")
                } catch (e: ArithmeticException) {
                    println("Error: No es pot dividir per 0")
                }
            }
            else -> println("Error: Operador no valid")
        }
    }
}