package lesson_19

const val NUMBER_OF_PERSONS = 5

enum class Sex(val sexLetter: String) {
    MALE("М"),
    FEMALE("Ж")
}

class Person(private var name: String, private var sex: Sex) {

    fun getName(): String {
        return name
    }

    fun getSex(): Sex {
        return sex
    }
}


fun getNameWithInputCheck(): String {
    var input: String? = readlnOrNull()?.trim()
    while (input == null || input == "") {
        print("Вы ничего не ввели. Повторите ввод имени: ")
        input = readln().trim()
    }
    return input
}

fun getSexWithInputCheck(): Sex {
    var input: String? = readlnOrNull()?.trim()?.uppercase()
    while (input == null || input != "М" && input != "Ж") {
        print("Недопустимое значение.\nВведите данные на русской раскладке согласно инструкции (М / Ж): ")
        input = readlnOrNull()?.trim()?.uppercase()
    }
    return if (input == "М") Sex.MALE else Sex.FEMALE
}


fun main() {
    println(
        """
        Введите имя и пол регистрируемого. Всего человек: $NUMBER_OF_PERSONS.
        Поле "Имя" не может быть пустым.
        Поле "Пол" может принимать только значения "М" (мужской) или "Ж" (женский) без кавычек.
        
    """.trimIndent()
    )

    val listOfPersons = mutableListOf<Person>()
    var person: Person

    for (i in 1..NUMBER_OF_PERSONS) {
        print("Введите имя: ")
        val name = getNameWithInputCheck()

        print("Введите пол (М / Ж): ")
        val sex = getSexWithInputCheck()

        person = Person(name, sex)
        listOfPersons.add(person)
    }

    println("--------------------\nВведены данные о следующих людях:")

    listOfPersons.forEach {
        println("Имя: ${it.getName()} | Пол: ${if (it.getSex().sexLetter == "М") "Муж." else "Жен."}")
    }
}