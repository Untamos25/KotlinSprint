package lesson_4

fun main() {

    val dayCounter = 5
    var isDayHands = true
    var isDayLegs = false
    var isDayBack = false
    var isDayAbs = true

    if ((dayCounter + 1) % 2 == 1) {
        isDayHands = false
        isDayLegs = true
        isDayBack = true
        isDayAbs = false
    }

    println(
        """
        Упражнения для рук:    $isDayHands
        Упражнения для ног:    $isDayLegs
        Упражнения для спины:  $isDayBack
        Упражнения для пресса: $isDayAbs
    """.trimIndent()
    )
}
