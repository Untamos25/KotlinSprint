package lesson_22

class Book(val name: String, val author: String)

data class CoolBook(val name: String, val author: String)

fun main() {
    val book = Book("Обычная книга", "Обычный автор")
    val coolBook = CoolBook("Классная книга", "Классный автор")

    println(book)
    println(coolBook)

    // println(book) выводит в консоль имя класса и хэш-код объекта.
    // println(coolBook) выводит в консоль название класса, названия и значения свойств,
    // так как data class автоматически переопределяет метод toString()
}