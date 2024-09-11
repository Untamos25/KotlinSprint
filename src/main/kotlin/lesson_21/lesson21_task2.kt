package lesson_21

fun List<Int>.evenNumbersSum(): Int {
    var sum = 0

    this.forEach {
        if (it % 2 == 0) sum += it
    }
    return sum
}

fun main() {
    val listOfNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(listOfNumbers.evenNumbersSum())
}