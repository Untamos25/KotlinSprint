package lesson_13

class ContactInfo(
    var name: String,
    var telephoneNumber: Long,
    var company: String? = null,
)

fun main() {

    val telephoneBook = listOf(
        ContactInfo("Ярополк", 89123456789, "Reddit"),
        ContactInfo("Святослав", 89113456789, "null"),
        ContactInfo("Всеволод", 89523456789, null),
        ContactInfo("Людмила", 89653456789, "Reddit"),
        ContactInfo("Владислав", 89293456789),
    )

    println("Список всех существующих компаний:")

    val companies = mutableListOf<String>()
    telephoneBook.forEach {
        if (it.company != null && !companies.contains(it.company!!))
            companies.add(it.company!!)
    }
    companies.forEach { println(" - \"$it\"") }

}