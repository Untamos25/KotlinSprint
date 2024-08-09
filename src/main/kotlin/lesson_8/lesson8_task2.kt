package lesson_8

fun main() {

    val ingredients = arrayOf(
        "Макароны", "Говядина", "Лук репчатый", "Масло сливочное", "Масло растительное", "Соль", "Перец", "Вода"
    )

    print("Введите ингредиент, который хотите найти: ")
    val input = readln()

    var find = false
    for (i in ingredients) {
        if (input.uppercase() == i.uppercase()) {
            find = true
            println("Ингредиент $i в рецепте есть")
            break
        }
    }
    if (!find) println("Такого ингредиента в рецепте нет")

}