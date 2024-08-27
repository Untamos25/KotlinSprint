package lesson_15

interface Search {
    fun search(name: String) {
        println("Выполняется поиск комплектующих для инструмента \"$name\"...")
    }
}

abstract class Product(val name: String, var quantityInStock: Int)

class MusicalInstrument(name: String, quantityInStock: Int) : Search, Product(name, quantityInStock)

class Accessory(name: String, quantityInStock: Int) : Product(name, quantityInStock)

fun main() {
    val guitar = MusicalInstrument("Гитара", 4)
    val strings = Accessory("Струны", 10)
    guitar.search("Гитара")

}
