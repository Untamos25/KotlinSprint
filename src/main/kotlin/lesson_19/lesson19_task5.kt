package lesson_19

const val NUMBER_OF_PERSONS = 5

enum class Sex(val sexLetter: String) {
    MALE("М"),
    FEMALE("Ж")
}

class Person(private val name: String, private val sex: Sex) {

    fun printInfoAboutPerson() {
        println("Имя: $name | Пол: ${if (sex == Sex.MALE) "Муж." else "Жен."}")
    }
}


fun getNameWithInputCheck(): String {
    var input: String? = readlnOrNull()?.trim()
    while (input == null || input == "") {
        print("Вы ничего не ввели. Повторите ввод имени: ")
        input = readlnOrNull()?.trim()
    }
    return input
}

fun getSexWithInputCheck(): Sex {
    var input: String? = readlnOrNull()?.trim()?.uppercase()
    while (input == null || input != Sex.MALE.sexLetter && input != Sex.FEMALE.sexLetter) {
        print("Недопустимое значение.\nВведите данные на русской раскладке согласно инструкции " +
                "(${Sex.MALE.sexLetter} / ${Sex.FEMALE.sexLetter}): ")
        input = readlnOrNull()?.trim()?.uppercase()
    }
    return if (input == Sex.MALE.sexLetter) Sex.MALE else Sex.FEMALE
}


fun main() {
    println(
        """
        Введите имя и пол регистрируемого. Всего человек: $NUMBER_OF_PERSONS.
        Поле "Имя" не может быть пустым.
        Поле "Пол" может принимать только значения:
        "${Sex.MALE.sexLetter}" (мужской) или "${Sex.FEMALE.sexLetter}" (женский) без кавычек.
        
    """.trimIndent()
    )

    val listOfPersons = mutableListOf<Person>()
    var person: Person

    for (i in 1..NUMBER_OF_PERSONS) {
        print("Введите имя: ")
        val name = getNameWithInputCheck()

        print("Введите пол (${Sex.MALE.sexLetter} / ${Sex.FEMALE.sexLetter}): ")
        val sex = getSexWithInputCheck()

        person = Person(name, sex)
        listOfPersons.add(person)
    }

    println("--------------------\nВведены данные о следующих людях:")
    listOfPersons.forEach { it.printInfoAboutPerson() }
}