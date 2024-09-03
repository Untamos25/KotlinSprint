package lesson_17

class User(_login: String, _password: String, ) {
    var login = _login
        set(value) {
            field = value
            println("Логин успешно изменён")
        }

    var password = _password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }

    fun printInfo() {
        println("Логин: $login")
        println("Пароль: $password")
        println()
    }
}

fun main() {
    val user1 = User("admin", "12345")

    user1.printInfo()

    user1.login = "newUser"
    println(user1.password)
    user1.password = "67890"
    println()

    user1.printInfo()
}