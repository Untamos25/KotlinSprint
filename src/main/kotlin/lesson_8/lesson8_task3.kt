package lesson_8

fun main() {

    val ingredients = arrayOf(
        "Макароны", "Говядина", "Лук репчатый", "Масло сливочное", "Масло растительное", "Соль", "Перец", "Вода"
    )

    print("Введите ингредиент, который хотите найти: ")
    val input = readln()

    val find = ingredients.find { it.equals(input, ignoreCase = true) }
    if (find != null) println("Ингредиент $find в рецепте есть")
    else println("Такого ингредиента в рецепте нет")

}