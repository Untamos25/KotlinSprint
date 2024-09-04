package lesson_17

class Folder(name: String, numberOfFiles: Int, private var isSecret: Boolean, ) {
    var name = name
        get() = if (isSecret) "Скрытая папка" else field

    var numberOfFiles = numberOfFiles
        get() = if (isSecret) 0 else field

    fun printInfoAboutFolder() {
        println(name)
        println("Количество фвйлов в папке: $numberOfFiles")
        println("Папка скрыта: $isSecret")
        println()
    }
}

fun main() {
    val folder1 = Folder("Папка 1", 20, true)
    val folder2 = Folder("Папка 2", 24, false)

    folder1.printInfoAboutFolder()
    folder2.printInfoAboutFolder()
}