package lesson_7

fun main() {
    print("Введите количество секунд для таймера: ")
    var input: String? = readln()
    while (input == null || !input.matches(Regex("\\d+"))) {
        print("Недопустимое значение!\nВам нужно ввести целое число. Попробуйте ещё раз.\nВведите число: ")
        input = readln()
    }
    val time = input.toInt()
    println("\nТаймер установлен на $time сек.")

    for (i in time downTo 1) {
        print("Осталось секунд: $i \r")
        Thread.sleep(1000)
    }
    println("Время вышло")

}