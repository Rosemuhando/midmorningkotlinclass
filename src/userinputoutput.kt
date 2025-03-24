import java.util.Scanner

fun main() {

    var read = Scanner(System.`in`)
    println("enter your firstname :")
    var firstname = readln()
    println("Hello there, $firstname")

    println("How old are you ?")
    var age = read.nextInt()
    println("user is $age years old")

    println("enter weight")
    var weight = read.nextDouble()
    println("my weight is $weight kg")

}