package lesson_3

fun main() {
    var moveStart: String
    var moveEnd: String
    var moveNumber = 0

    moveStart = "E2"
    moveEnd = "E4"
    moveNumber++

    var moveInfo = "$moveStart-$moveEnd;$moveNumber"
    println(moveInfo)

    moveStart = "D2"
    moveEnd = "D${2+1}"
    moveNumber++

    moveInfo = "$moveStart-$moveEnd;$moveNumber"
    println(moveInfo)

}