fun main() {
    //standard library functions/ predefined functions
    var x = Math.sqrt(144.0)
    println("The square root of 144 is $x")
    var y = Math.round(45.45)
    println("the output is $y")

    school() // calling a function
    student("joseph",21)
    student("ian",19)


    employee("mark",2145,false )
   employee("ann",1900,true)
   employee("joan",2344,true)

}
//user defined functions
fun school(){
    println("emobilis")

}

// parameter/ variable and arguments/ value
fun student(name:String,age:Int) {
    println("$name is $age years old")


}
//a simple program printing three employee's details

fun employee(name:String,salary:Int,disability:Boolean) {
    println("$name earns $salary.Disability:$disability ")


}