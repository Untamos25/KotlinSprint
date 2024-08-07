package lesson_7

fun main() {

    do {
        val authCode = (1000..9999).random().toString()
        println("Ваш код авторизации: $authCode")
        print("Введите код авторизации: ")
        val userCode = readln()

        if (userCode == authCode) {
            println("Добро пожаловать!")
            return
        } else println("Вы ввели неверный код. Пожалуйста, повторите попытку.\n")

    } while (userCode != authCode)

}