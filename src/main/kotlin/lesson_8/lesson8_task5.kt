package lesson_8

private const val MIN_COUNT = 0

fun main() {

    print("Введите количество ингредиентов: ")
    var inputCount: String? = readln()
    while (inputCount == null || !inputCount.matches(Regex("\\d+")) || inputCount.toInt() <= MIN_COUNT) {
        print("Недопустимое значение. Введите целое число больше $MIN_COUNT: ")
        inputCount = readln()
    }
    val count = inputCount.toInt()

    val ingredients = Array<String?>(count) { null }

    for (i in 0..<count) {
        print("Введите ингредиент #${i + 1}: ")
        var inputIngred: String = readln()
        while (inputIngred.trim() == "") {
            print("Вы ничего не ввели. Повторите попытку: ")
            inputIngred = readln()
        }
        ingredients[i] = inputIngred
    }

    println("Ваш список ингредиентов: " + ingredients.joinToString(", "))

}