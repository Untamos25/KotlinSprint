package lesson_7

fun main() {

    val passLength = 6
    var pass = ""
    val chars = ('a'..'z')
    val numbers = (0..9)

    for (i in 1..passLength) pass += if ((i + 1) % 2 == 0) chars.random() else numbers.random()
    println(pass)

}