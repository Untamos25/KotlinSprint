package lesson_21

fun String.vowelCount(): Int {
    val vowels = "АаЕеЁёИиОоУуЫыЮюЯяAaEeIiOoUuYy"
    var count = 0
    for (char in this) {
        if (vowels.contains(char.toString())) count++
    }
    return count
}

fun main() {
    val str = "Hello, World1"
    println(str.vowelCount())
}