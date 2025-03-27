//patent class/super class/base class
open class Animal{
    var age = 3
    var gender = "male"

    fun makesound(){
        println("Animal is speaking")
    }

}

//child classes/derived class/ subclass
class dog:Animal(){
    fun bark(){
        println("woof! woof!")
    }
}

class cat{
    var colour = "white"
    var hasfur = true
    fun meaow(){
        println("meaow! meaow!")

    }
}

fun main() {
    var a = Animal()
    var d = dog()
    d.bark()
    println(d.gender)
    var c = cat()



}