fun main() {
    var doctor1 = person()
    println(doctor1.name)
    doctor1.speak()

    

}

class person{
    var name = "jane"
    var age = 35
    var department = "department1"

    fun speak(){
        println("doctor is speaking ")
    }


}