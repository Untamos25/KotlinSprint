package lesson_11

class User2(
    var id: Int,
    var login: String,
    var password: String,
    var email: String,
    var bio: String = ""
) {
    fun printUserInfo() {
        println(
            """
                
            Пользователь: $id 
            Логин: $login
            Пароль: $password
            e-mail: $email
            """.trimIndent()
        )
        if (bio != "") println("О себе: $bio")
    }

    fun inputBio() {
        println("\nВведите информацию о себе.")
        bio = readln()
    }

    fun changePassword() {
        print("\nВведите текущий пароль для его изменения: ")
        if (password == readln()) {
            print("Введите новый пароль: ")
            password = readln()
            println("Пароль успешно изменён.")
        } else println("Пароль введён неправильно.")
    }
}

fun main() {
    val testUser = User2(
        id = 1,
        login = "admin",
        password = "pass",
        email = "admin@test.ru",
    )

    testUser.printUserInfo()
    testUser.inputBio()
    testUser.changePassword()
    testUser.printUserInfo()
}