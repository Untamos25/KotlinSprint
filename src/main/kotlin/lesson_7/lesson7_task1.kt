package lesson_7

fun main() {

    val passLength = 6

    for (i in 1..passLength) {
        val pass = if ((i + 1) % 2 == 0) ('a'..'z').random() else (0..9).random()
        print(pass)
    }

}