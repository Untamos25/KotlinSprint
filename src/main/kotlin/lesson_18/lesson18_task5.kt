package lesson_18

interface Drawable {
    fun draw(x: Int, y: Int)
    fun draw(x: Float, y: Float)
}

class Point : Drawable{
    override fun draw(x: Int, y: Int){
        println("Нарисовать точку по координатам ($x, $y)")
    }
    override fun draw(x: Float, y: Float){
        println("Нарисовать точку по координатам ($x, $y)")
    }
}

class Circle(val radius: Int) : Drawable{
    override fun draw(x: Int, y: Int){
        println("Нарисовать круг с радиусом $radius по координатам ($x, $y)")
    }
    override fun draw(x: Float, y: Float){
        println("Нарисовать круг с радиусом $radius по координатам ($x, $y)")
    }
}

class Square(val sideLength: Int): Drawable{
    override fun draw(x: Int, y: Int){
        println("Нарисовать квадрат со длиной стороны $sideLength по координатам ($x, $y)")
    }
    override fun draw(x: Float, y: Float){
        println("Нарисовать квадрат со длиной стороны $sideLength по координатам ($x, $y)")
    }
}

class Screen {
    fun draw(x: Int, y: Int, shape: Drawable) {
        shape.draw(x, y)
    }
    fun draw(x: Float, y: Float, shape: Drawable) {
        shape.draw(x, y)
    }
}


fun main() {
    val screen = Screen()

    val point = Point()
    val circle = Circle(5)
    val square = Square(4)

    screen.draw(2,3, point)
    screen.draw(5.4f,6.1f, point)
    println()
    screen.draw(2,3, circle)
    screen.draw(5.4f,6.1f, circle)
    println()
    screen.draw(2,3, square)
    screen.draw(5.4f,6.1f, square)
}