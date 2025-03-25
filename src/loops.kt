fun main() {
    //while loop
    var number = 20

    while (number <= 25){
        println("Number is $number")
        number  ++

    }
 // print values ranging from 5 to 1
    var num = 5
    while (num >= 1) {
        println(" number is $num")
        num--
    }
    //Do while loop
    var count = 100
    do {
        println("number is $count")
        count++
    }
        while (count <= 105)


// For loop
for (x in 35..40){
    println("number : $x")
}
for (letter in 'a'..'d') {
    println("letter is : $letter")
}
    //break

    for (a in 1..5){
        if (a == 3){
            break
        }
        println("Number is:$a")
    }
    //continue
    for (myletter in 'd'..'h') {
        if (myletter == 'f') {
            continue
        }
        println("my letter is: $myletter")
    }



}