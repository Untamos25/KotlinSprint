package lesson_13

class InfoContact(
    var name: String = "",
    var telephoneNumber: Long? = null,
    var company: String? = null,
) {
    fun addContact() {
        println("Введите имя контакта:")
        name = readln()

        println("Введите номер телефона:")
        telephoneNumber = readln().toLongOrNull()
        if (telephoneNumber == null) {
            println("Вы не ввели номер телефона. Этот контакт не будет добавлен.\n")
            return
        }

        println("Введите название компании:")
        company = readln()
        if (company == "") company = null

        println()
    }

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
        val contact = InfoContact()
        contact.addContact()
        if (contact.telephoneNumber != null) telephoneBook.add(contact)
    }

    if (telephoneBook.isNotEmpty()) {
        println("--------------------\nДобавленные контакты:\n")
        telephoneBook.forEach {
            it.printContact()
        }
    }

}