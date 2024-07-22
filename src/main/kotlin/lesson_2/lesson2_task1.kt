package lesson_2

fun main() {

    val numberOfStudents = 4
    val englishScores = arrayOf(3, 4, 3, 5)
    var englishScoresSum = 0f
    val averageScore = englishScoresSum / numberOfStudents

    for (element in englishScores) englishScoresSum += element

    println(String.format("%.2f", averageScore))

}