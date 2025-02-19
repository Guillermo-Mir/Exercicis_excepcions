import models.Calculadora
import java.lang.ArithmeticException
import java.util.*

fun main() {
    val scan: Scanner = Scanner(System.`in`)

    var calculadora: Calculadora = Calculadora()

    var num1: Int = 0
    var num2: Int = 0
    var operador: String = ""

    print("Introdueix el operador per fer la operació: ")
    operador = scan.next()

    if (operador == "Z" || operador == "z") {
        println("Sortint del programa...")
        return
    }

    try {
        print("Introdueix el primer numero: ")
        num1 = Integer.parseInt(scan.next())

        print("Introdueix el segon numero: ")
        num2 = Integer.parseInt(scan.next())

    } catch (e: NumberFormatException) {
        println("Error: Has d'introduir un numero")
    }

    calculadora.operacions(operador, num1, num2)

}