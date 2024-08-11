package lesson_9

private const val NUMBER_OF_INGREDIENTS = 5

fun main() {

    println("Введите $NUMBER_OF_INGREDIENTS ингредиентов через запятую с пробелом: ")
    var input: String? = readln()
    while (input == null || input.split(", ").size != NUMBER_OF_INGREDIENTS) {
        println("Вы ввели неверное количество ингредиентов. Попробуйте ещё раз:")
        input = readln()
    }

    val ingredients = input.split(", ")
    val sorted = ingredients.sorted()

    println("\nСписок ингредиентов:")
    sorted.forEach { println(it) }

}
