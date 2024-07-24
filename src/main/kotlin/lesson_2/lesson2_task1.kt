package lesson_2

fun main() {

    val numberOfStudents = 4
    val englishScores = arrayOf(3, 4, 3, 5).sum().toFloat()

    val averageScore = englishScores / numberOfStudents

    println(String.format("%.2f", averageScore))

}