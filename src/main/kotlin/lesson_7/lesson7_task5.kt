package lesson_7

private const val MIN_LENGTH = 6

fun main() {

    val passLength: Int
    var pass: String
    val charsUp = ('A'..'Z')
    val charsLow = ('a'..'z')
    val numbers = (0..9)
    val allSymbols = charsUp + charsLow + numbers

    print("Введите желаемую длину пароля. Длина пароля должна быть не менее $MIN_LENGTH символов: ")
    var input: String? = readln()
    while (input == null || !input.matches(Regex("\\d+")) || input.toInt() < MIN_LENGTH) {
        println("Недопустимое значение, попробуйте ещё раз.\nВведите желаемую длину пароля: ")
        input = readln()
    }
    passLength = input.toInt()

    do {
        pass = ""
        for (i in 1..passLength) pass += allSymbols.random()
    } while (!pass.any(Char::isLowerCase) || !pass.any(Char::isUpperCase) || !pass.any(Char::isDigit))

    println("Ваш новый пароль: $pass")

}















