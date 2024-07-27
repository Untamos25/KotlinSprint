package lesson_5

fun main() {

    val userRegistered = "Zaphod"
    val passRegistered = "PanGalactic"

    print("Введите имя пользователя: ")
    val username = readln()
    if (username == userRegistered) {
        print("Введите пароль: ")
        val pass = readln()
        if (pass == passRegistered) println("Авторизация пройдена!\nДобро пожаловать!")
        else println("Пароль не верный.\nПройдите процедуру авторизации повторно.")
    } else println("Пожалуйста, зарегистрируйтесь.")
}