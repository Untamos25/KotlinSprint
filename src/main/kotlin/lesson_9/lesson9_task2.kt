package lesson_9

private const val ANSWER_POSITIVE = "Да"

fun main() {

    val ingredients = mutableListOf("Макароны", "Сосиски", "Кетчуп")

    println("В рецепте есть базовые ингредиенты:")
    ingredients.forEach { println(it) }

    print("\nЖелаете добавить ещё? (Да / Нет) ")
    val answer = readln()

    if (answer.uppercase() == ANSWER_POSITIVE.uppercase()) {
        print("Какой ингредиент вы хотите добавить? ")
        var newIngredient = readln()
        while (newIngredient.trim() == "") {
            print("Вы ничего не ввели. Повторите попытку: ")
            newIngredient = readln()
        }
        ingredients.add(newIngredient.trim())

        println("\nТеперь в рецепте есть следующие ингредиенты:")
        ingredients.forEach { println(it) }
    }
}