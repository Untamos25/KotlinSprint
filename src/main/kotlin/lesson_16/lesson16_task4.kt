package lesson_16

class Order(private val number: Int, private var status: String) {

    val orderNumber: Int
        get() = number

    val orderStatus: String
        get() = status

    private fun changeStatus(newOrderStatus: String) {
        status = newOrderStatus
    }

    fun requestStatusChange(newStatus: String) {
        println("Менеджер получил информацию о необходимости изменить статус заказа №$number на \"$newStatus\".")
        changeStatus(newStatus)
        println("Менеджер изменил статус заказа.")
    }
}

fun main() {

    val order1 = Order(1, "В сборке")
    println("Текущий статус заказа №${order1.orderNumber}: \"${order1.orderStatus}\".")

    println("Отправка заявки менеджеру для изменения статуса заказа.")
    order1.requestStatusChange("В пути")

    println("Текущий статус заказа №${order1.orderNumber}: \"${order1.orderStatus}\".")
}