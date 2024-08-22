package lesson_13

class TelephoneBookContact(
    var name: String,
    var telephoneNumber: Long,
    var company: String? = null,
) {
    fun printContact() {
        println("Имя: $name\nНомер: $telephoneNumber\nКомпания: ${company ?: "<не указано>"}\n")
    }
}

fun main() {
    val contact1 = TelephoneBookContact("Ростислав", 89123456789, "Reddit")
    val contact2 = TelephoneBookContact("Мирослав", 89113456789)

    contact1.printContact()
    contact2.printContact()
}