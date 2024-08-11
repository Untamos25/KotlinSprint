package lesson_10

private const val VALID_LOGIN = "login"
private const val VALID_PASS = "pass"
private const val TOKEN_LENGTH = 32


fun main() {
    print("Введите логин: ")
    val inputLogin = readln()
    print("Введите пароль: ")
    val inputPass = readln()

    val cart = getCart(authorize(inputLogin, inputPass))

    if (cart != null) {
        println("Корзина:")
        cart.forEach { println(" - $it") }
    } else println("Логин или пароль введены неверно.")
}


private fun authorize(login: String, pass: String): String? {
    return if (login == VALID_LOGIN && pass == VALID_PASS) generateToken() else null
}

private fun generateToken(): String {
    var token = ""
    val chars = ('A'..'Z') + ('a'..'z') + (0..9)
    for (i in 1..TOKEN_LENGTH) token += chars.random()
    return token
}

private fun getCart(token: String?): List<String>? {
    val cart = listOf("Товар 1", "Товар 2", "Товар 3")
    return if (token != null) cart else null
}
