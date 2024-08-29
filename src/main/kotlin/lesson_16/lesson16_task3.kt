package lesson_16

class User (val login: String, private val password: String, ) {

    fun passwordValidation(inputPassword: String): Boolean {
        return inputPassword == password
    }
}

fun main() {
    val user1 = User("admin", "12345")

    print("Введите пароль: ")
    val inputPassword = readln()

    if (user1.passwordValidation(inputPassword)) println("Пароль верный")
    else println("Пароль не верный")
}