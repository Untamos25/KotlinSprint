package lesson_5

private const val AGE_OF_MAJORITY = 18

fun main() {

    val yearCurrent = java.time.LocalDate.now().year

    print("Введите ваш год рождения: ")
    val yearUser = readln().toInt()

    if (yearCurrent - yearUser >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")

}