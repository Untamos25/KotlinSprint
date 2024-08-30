package lesson_16

class User(private val login: String, private val password: String) {
    fun validatePassword(inputPassword: String): Boolean = inputPassword == password
}

fun main() {
    val user1 = User("admin", "12345")

    print("Введите пароль: ")
    val inputPassword = readln()

    if (user1.validatePassword(inputPassword)) println("Пароль верный")
    else println("Пароль не верный")
}