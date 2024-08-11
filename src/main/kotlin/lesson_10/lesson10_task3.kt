package lesson_10

private const val MIN_LENGTH = 1

fun main() {
    print("Введите желаемую длину пароля: ")
    println("Ваш новый пароль: ${generatePass(checkInputLength())}")
}

private fun checkInputLength(): Int {
    var input: String? = readln()

    while (input == null || !input.matches(Regex("\\d+")) || input.toInt() < MIN_LENGTH) {
        print("Недопустимое значение, попробуйте ещё раз.\nВведите желаемую длину пароля: ")
        input = readln()
    }
    return input.toInt()
}

private fun generatePass(passLength: Int): String {
    var pass = ""
    val numbers = (0..9)
    val specialChars = ('!'..'/') + " "

    for (i in 1..passLength) pass += if ((i + 1) % 2 == 0) numbers.random() else specialChars.random()
    return pass
}