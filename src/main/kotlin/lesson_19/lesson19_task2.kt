package lesson_19

enum class Category(val categoryName: String) {
    CLOTHES("Одежда"),
    STATIONERY("Канцелярские товары"),
    OTHER("Разное");

    fun getNameOfCategory(): String {
        return categoryName
    }
}

class Product(val id: Int, val productName: String, val category: Category) {

    fun printProductInfo() {
        println("#$id. $productName (категория: \"${category.getNameOfCategory()}\").")
    }
}


fun main() {
    val product1 = Product(76, "Носки с человеком-пауком", Category.CLOTHES)
    val product2 = Product(33, "Зарядное устройство", Category.OTHER)
    val product3 = Product(112, "Ручка", Category.STATIONERY)

    val listOfProducts = listOf(product1, product2, product3)
    listOfProducts.forEach {
        it.printProductInfo()
    }
}