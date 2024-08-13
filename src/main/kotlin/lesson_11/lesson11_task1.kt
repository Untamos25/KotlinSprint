package lesson_11

class User(
    var id: Int,
    var login: String,
    var password: String,
    var email: String,
)

fun main() {
    val user1 = User(
        id = 1,
        login = "Admin",
        password = "Password",
        email = "admin@test.ru",
    )

    val user2 = User(
        2,
        "user",
        "userpass",
        "user@test.ru",
    )

    println("Пользователь ${user1.id}: ${user1.login} ${user1.password}, e-mail: ${user1.email}")
    println("Пользователь ${user2.id}: ${user2.login} ${user2.password}, e-mail: ${user2.email}")
}