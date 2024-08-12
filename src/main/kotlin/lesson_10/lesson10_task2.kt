package lesson_10

private const val MIN_LENGTH = 4

fun main() {
    print("Введите логин: ")
    val login = checkLength()
    print("Введите пароль: ")
    val pass = checkLength()

    println("Добро пожаловать, $login!\nВаш пароль: $pass")
}

private fun checkLength(): String {
    var input: String = readln()
    while (input.length < MIN_LENGTH) {
        print("Логин и пароль должны содержать минимум 4 символа.\nПовторите попытку: ")
        input = readln()
    }
    return input
}

