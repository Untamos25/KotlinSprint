package lesson_22

class RegularBook(val name: String, val author: String)

data class Databook(val name: String, val author: String)

fun main() {
    val regularBook1 = RegularBook("Название", "Автор")
    val regularBook2 = RegularBook("Название", "Автор")
    val dataBook1 = Databook("Название", "Автор")
    val dataBook2 = Databook("Название", "Автор")

    println(regularBook1 == regularBook2)    // false, т.к. сравниваются ссылки на объекты

    println(dataBook1 == dataBook2)    // true, т.к. сравниваются значения свойств между собой,
                                       // потому что data class переопределяет метод equals()
}