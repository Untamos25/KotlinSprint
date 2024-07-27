package lesson_4

fun main() {

    val dayCounter = 5
    val whatTrainingToday = if ((dayCounter + 1) % 2 == 1) true else false // false = руки и пресс / true = ноги и спина

    println(
        """
        Упражнения для рук:    ${!whatTrainingToday}
        Упражнения для ног:    $whatTrainingToday
        Упражнения для спины:  $whatTrainingToday
        Упражнения для пресса: ${!whatTrainingToday}
    """.trimIndent()
    )
}
