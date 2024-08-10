package lesson_9

fun main() {

    val map = mutableMapOf("Яйца (шт.)" to 2, "Молоко (мл)" to 50, "Сливочное масло (г)" to 15)

    print("Какое количество порций вы хотите приготовить? ")
    var input: String? = readln()
    while (input == null || !input.matches(Regex("\\d+"))) {
        print("Недопустимое значение, попробуйте ещё раз.\nВведите целое число: ")
        input = readln()
    }
    val answer = input.toInt()

    map.forEach { map[it.key] = it.value * answer }

    println("\nНа $answer порции вам понадобится:")
    map.forEach { println(" - ${it.key} - ${it.value}") }

}