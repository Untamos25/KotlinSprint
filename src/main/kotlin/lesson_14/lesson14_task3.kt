package lesson_14

private const val COLOR_1 = "Белый"
private const val COLOR_2 = "Чёрный"


abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {
    override fun calculateArea(): Double {
        return (Math.PI * radius * radius)
    }

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Rectangle(
    color: String,
    val width: Int,
    val height: Int,
) : Figure(color) {
    override fun calculateArea(): Double {
        return (height * width).toDouble()
    }

    override fun calculatePerimeter(): Double {
        return ((height + width) * 2).toDouble()
    }
}

fun main() {
    val figures = listOf(
        Circle(COLOR_1, 1),
        Circle(COLOR_2, 2),
        Rectangle(COLOR_1, 1, 1),
        Rectangle(COLOR_2, 2, 1),
    )

    val sumPerimeters = String.format("%.2f", figures.filter { it.color == COLOR_2 }.sumOf { it.calculatePerimeter() })
    val sumAreas = String.format("%.2f", figures.filter { it.color == COLOR_1 }.sumOf { it.calculateArea() })

    println("Сумма периметорв всех фигур цвета \"$COLOR_2\" = $sumPerimeters")
    println("Сумма площадей всех фигур цвета \"$COLOR_1\" = $sumAreas")

}