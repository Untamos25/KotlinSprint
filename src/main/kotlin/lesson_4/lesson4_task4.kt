package lesson_4

fun main() {

    val dayCounter = 5

    val workout = if ((dayCounter + 1) % 2 == 1)
        listOf(false, true) // Руки и пресс, ноги и спина
    else
        listOf(true, false) // Руки и пресс, ноги и спина

    println(
        """
        Упражнения для рук:    ${workout[0]}
        Упражнения для ног:    ${workout[1]}
        Упражнения для спины:  ${workout[1]}
        Упражнения для пресса: ${workout[0]}
    """.trimIndent()
    )
}
