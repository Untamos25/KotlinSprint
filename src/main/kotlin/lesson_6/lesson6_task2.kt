package lesson_6

private const val MILLIS_IN_SEC = 1000

fun main() {

    print("Введите количество секунд для таймера: ")
    var input: String? = readln()
    while (input == null || !input.matches(Regex("\\d+"))) {
        print("Недопустимое значение!\nВам нужно ввести целое число. Попробуйте ещё раз.\nВведите количество секунд: ")
        input = readln()
    }
    val counter = input.toLong() * MILLIS_IN_SEC
    Thread.sleep(counter)
    println("Прошло $input сек.")

}