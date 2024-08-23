package lesson_13

class InfoContact(
    var name: String = "",
    var telephoneNumber: Long? = null,
    var company: String? = null,
) {
    fun printContact() {
        println("Имя: $name\nНомер телефона: $telephoneNumber\nКомпания: ${company ?: "<не указано>"}\n")
    }
}

fun main() {

    print("Укажите, какое количество контактов вы хотите внести в телефонную книгу: ")
    val counter = readln().toIntOrNull() ?: 0
    if (counter == 0) println("Вы не указали количество добавляемых контактов. Ввод данных отменён.")

    val telephoneBook = mutableListOf<InfoContact>()
    for (i in 0..<counter) {
        println("Введите имя контакта:")
        val name = readln()

        println("Введите номер телефона:")
        val telephoneNumber = readln().toLongOrNull()
        if (telephoneNumber == null) {
            println("Вы не ввели номер телефона. Этот контакт не будет добавлен.\n")
            continue
        }

        println("Введите название компании:")
        var company: String? = readln()
        if (company == "") company = null

        println()

        val contact = InfoContact(name, telephoneNumber, company)
        telephoneBook.add(contact)
    }

    if (telephoneBook.isNotEmpty()) {
        println("--------------------\nДобавленные контакты:\n")
        telephoneBook.forEach {
            it.printContact()
        }
    }

}