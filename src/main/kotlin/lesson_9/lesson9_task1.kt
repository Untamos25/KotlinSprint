package lesson_9

fun main() {
    val ingredients = listOf("Макароны", "Сосиски", "Кетчуп")

    println("В рецепте есть следующие ингредиенты:")
    ingredients.forEach { println(it) }
}