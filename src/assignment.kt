
// a simple program that allows one to enter 3 numbers and compaires the largest
import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("enter firstnumber:")
    var firstnumber = read.nextInt()

    println("enter secondnumber:")
    var secondnumber = read.nextInt()

    println("enter thirdnumber:")
    var thirdnumber = read.nextInt()

    if (firstnumber > secondnumber && firstnumber > thirdnumber){
        println( "the largest number is $firstnumber")
    }
    else if (
        secondnumber > firstnumber && secondnumber > thirdnumber){
        println("the largest number is $secondnumber")
    }
    else{
        println("largest number is $thirdnumber")
    }

}








