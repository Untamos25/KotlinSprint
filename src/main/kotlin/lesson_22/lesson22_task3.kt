package lesson_22

data class Dog(val paws: String, val whiskers: String, val tail: String)

fun main() {
    val dog = Dog("Мощные", "Колючие", "Мохнатый")

    val (paws, whiskers, tail) = dog

    println("Лапищи: $paws")
    println("Усищи: $whiskers")
    println("Хвост: $tail")
}