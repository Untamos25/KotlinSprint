package lesson_18

class Order {

    fun printOrderInfo(number: Int, product: String) {
        println("Заказ #$number. Заказан товар: $product")
    }

    fun printOrderInfo(number: Int, products: List<String>) {
        print("Заказ #$number. Заказаны следующие товары: ")
        println(products.joinToString(", "))
    }
}

fun main() {
    val order1 = Order()
    val order2 = Order()

    order1.printOrderInfo(1, "Монитор")
    order2.printOrderInfo(2, listOf("Монитор", "Мышка", "Клавиатура"))
}