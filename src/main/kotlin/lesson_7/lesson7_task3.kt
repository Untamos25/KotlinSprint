package lesson_7

fun main() {

    print("Введите число для поиска чётных чисел: ")
    var input: String? = readln()
    while (input == null || !input.matches(Regex("\\d+"))) {
        print("Недопустимое значение!\nВам нужно ввести целое число. Попробуйте ещё раз.\nВведите число: ")
        input = readln()
    }
    val numberUser = input.toInt()

    println("Все чётные числа от 0 до $numberUser:")
    for (i in 0..numberUser step 2) println(i)

}