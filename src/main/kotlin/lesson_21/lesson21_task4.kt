package lesson_21

import java.io.File

fun File.writeWordToStart(word : String) {
    val lowerCaseWord = word.lowercase()
    val fileContent = this.readText()

    this.writeText("")
    this.appendText("$lowerCaseWord\n$fileContent")
}

fun main() {
    val word = "First"
    val file = File("textFile.txt")

    file.writeWordToStart(word)
}