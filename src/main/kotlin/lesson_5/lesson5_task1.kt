package lesson_5

fun main() {
    val summand1 = (0..9).random()
    val summand2 = (0..9).random()

    print("Докажите, что вы человек.\nРешите выражение: $summand1 + $summand2 = ")
    val answer = readln().toInt()

    if (answer == summand1 + summand2) println("Добро пожаловать!")
    else println("Доступ запрещён")

}