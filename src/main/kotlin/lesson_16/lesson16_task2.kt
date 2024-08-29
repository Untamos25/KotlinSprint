package lesson_16

private const val PI = 3.14

class Circle(private val radius: Double) {
    fun calculateArea() = PI * radius * radius
    fun calculateCircleLength() = 2 * PI * radius
}

fun main() {
    val circle1 = Circle(5.0)
    println("Площадь круга: ${String.format("%.2f", circle1.calculateArea())}")
    println("Длина окружности: ${String.format("%.2f", circle1.calculateCircleLength())}")
}