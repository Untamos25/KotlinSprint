package lesson_6

fun main() {

    print("Введите количество секунд для таймера: ")
    var input: String? = readln()
    while (input == null || !input.matches(Regex("\\d+"))) {
        print("Недопустимое значение!\nВам нужно ввести целое число. Попробуйте ещё раз.\nВведите количество секунд: ")
        input = readln()
    }
    var counter = input.toInt()

    while (counter > 0) {
        print("Осталось секунд: ${counter--} \r")
        Thread.sleep(1000)
    }
    println("Время вышло")

}