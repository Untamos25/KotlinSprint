package lesson_4

fun main() {

    val dayCounter = 5

    val workout = if ((dayCounter + 1) % 2 == 1)
        listOf(false, true, true, false) // Руки, ноги, спина, пресс
    else
        listOf(true, false, false, true) // Руки, ноги, спина, пресс

    println(
        """
        Упражнения для рук:    ${workout[0]}
        Упражнения для ног:    ${workout[1]}
        Упражнения для спины:  ${workout[2]}
        Упражнения для пресса: ${workout[3]}
    """.trimIndent()
    )
}
