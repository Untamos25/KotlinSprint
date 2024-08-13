package lesson_10

private const val VALID_LOGIN = "login"
private const val VALID_PASSWORD = "pass"
private const val TOKEN_LENGTH = 32

fun main() {
    print("Введите логин: ")
    val inputLogin = readln()
    print("Введите пароль: ")
    val inputPassword = readln()

    val token = authorizeUser(inputLogin, inputPassword)
    if (token != null) {
        val cart = getCart(token)
        println("Корзина:")
        cart.forEach { println(" - $it") }
    } else println("Логин или пароль введены неверно.")
}

private fun authorizeUser(login: String, password: String): String? {
    return if (login == VALID_LOGIN && password == VALID_PASSWORD) generateToken() else null
}

private fun generateToken(): String {
    var token = ""
    val chars = ('A'..'Z') + ('a'..'z') + (0..9)
    for (i in 1..TOKEN_LENGTH) token += chars.random()
    return token
}

private fun getCart(token: String): List<String> {
    println("Получен токен: $token\n")
    return listOf("Товар 1", "Товар 2", "Товар 3")
}
