import java.lang.ArithmeticException
import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var num: Int  = 0
    var num2: Int = 0
    val  scan: Scanner = Scanner(System. `in`)

    try{
        println("Introdueix el primer número")
        num = Integer.parseInt(scan.next())
        println("Introdueix el segon número")
        num2 = Integer.parseInt(scan.next())
        var divisio: Int = num/num2

    }catch (e: NumberFormatException){
        println("No és un número")
    }catch (e: ArithmeticException){
        println("No pot divdir per 0")
    }


}