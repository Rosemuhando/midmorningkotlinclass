fun main() {
    var dog1 = Dog("Billy","Chihuahua","brown")
    println(dog1.breed)


    var dog2 = Dog("Mike","kienyeji","Brown")
    println(dog2.name)

    var dog3 = Dog("Joseph","German shepherd","white")
    println(dog3.colour)

    var dog4 = Dog("Ian","Siberian Husky","white")
    println(dog4.name)


}

class Dog(var name:String,var breed:String , var colour: String) {


}