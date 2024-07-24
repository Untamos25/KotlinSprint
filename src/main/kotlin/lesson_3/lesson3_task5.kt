package lesson_3

fun main() {
    val moveInfo = "D2-D4;0"
    val moveParts = Regex("[-;]").split(moveInfo)

    val moveStart = moveParts[0]
    val moveEnd = moveParts[1]
    val moveNumber = moveParts[2].toInt()

    println(moveStart)
    println(moveEnd)
    println(moveNumber)

}