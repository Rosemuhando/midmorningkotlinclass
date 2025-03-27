open class shape{
    open fun draw(){
        println("drawing a shape")

    }
}

class circle:shape(){
    override fun  draw (){
        println("drawing a circle")

    }
}

class square:shape(){
    override fun  draw (){
        println("drawing a square")

    }
}

fun main() {
    var sh = shape()
    sh.draw()

    var ci = circle()
    ci.draw()

    var sq = square()
    sq.draw()

}