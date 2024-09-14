package lesson_21

import java.io.File

fun File.writeWordToStart(word : String) {
    val fileContent = this.readText()
    this.writeText("${word.lowercase()}\n$fileContent")
}

fun main() {
    val word = "New word"
    val file = File("textFile.txt")

    file.writeWordToStart(word)
}