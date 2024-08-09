package lesson_7

private const val MIN_LENGTH = 6

fun main() {

    val passLength: Int
    var pass = ""
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

    pass += charsUp.random().toString() + numbers.random().toString() + charsLow.random().toString()
    for (i in 4..passLength) pass += allSymbols.random()

    println("Ваш новый пароль: $pass")

}