import java.util.Scanner

fun main() {
    // a calculator prompting one to enter two numbers and an operator using when statement
    var read = Scanner(System.`in`)
    println("enter firstnumber:")
    var firstnumber = read.nextDouble()

    println("enter an operator of your choice (+,-,* or /) :")
    var operator = readln()

    println("enter secondnumber:")
    var secondnumber = read.nextDouble()
    var result = when(operator){

    "+" -> firstnumber+secondnumber
    "-" -> firstnumber-secondnumber
    "*" -> firstnumber*secondnumber
    "/" -> firstnumber/secondnumber


    else -> "invalid operator "

}
    println("the results are $result")
}