package lesson_8

fun main() {

    val ingredients = arrayOf(
        "Макароны", "Говядина", "Лук репчатый", "Масло сливочное", "Масло растительное", "Соль", "Перец", "Вода"
    )

    print("Введите название ингредиента, который хотите найти: ")
    val input = readln()

    for (i in ingredients) {
        if (input.uppercase() == i.uppercase()) {
            println("Ингредиент $i в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")

}