package lesson_20

fun main() {
    val username = "Повелитель"

    val printStringWithLambda: (String) -> Unit = { println("С наступающим Новым Годом, $it!") }
    printStringWithLambda(username)
}