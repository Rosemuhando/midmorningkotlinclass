import kotlin.coroutines.coroutineContext

fun main() {
    var firstname = "rose"
    var lastname = "kamau"

    println(firstname + "" + lastname) //string concatination
    println( firstname [0])
    println(firstname.uppercase())// method
    println(lastname. lowercase())
// string interpolation
    println("my first name is" +firstname)
    println("my last name is $lastname")

}