package lesson_6

fun main() {

    var userLoginReg: String
    var userPassReg: String
    var numberOfTries = 3

    println("Регистрация нового аккаунта.")

    do {
        print("Введите логин: ")
        userLoginReg = readln()
        print("Введите пароль: ")
        userPassReg = readln()
        if (userLoginReg == "" || userPassReg == "")
            println("Поля логин и пароль не могут быть пустыми!")
    } while (userLoginReg == "" || userPassReg == "")

    println("\nРегистрация завершена.\nВведите логин и пароль для авторизации.")

    do {
        print("Введите логин: ")
        val userLoginAuth = readln()
        print("Введите пароль: ")
        val userPassAuth = readln()
        if (userLoginReg != userLoginAuth || userPassReg != userPassAuth)
            println("Введён неверный логин или пароль. Повторите попытку.")

    } while (userLoginReg != userLoginAuth || userPassReg != userPassAuth)

    println("\nДокажите, что вы человек.")

    do {
        val summand1 = (1..9).random()
        val summand2 = (1..9).random()
        print("Решите выражение: $summand1 + $summand2 = ")

        var input: String? = readln()
        while (input == null || !input.matches(Regex("\\d+"))) {
            print("Недопустимое значение!\nРешите выражение повторно:\n$summand1 + $summand2 = ")
            input = readln()
        }
        val answer = input.toInt()

        if (answer == summand1 + summand2) {
            println("\nДобро пожаловать!")
            break
        } else println("Неверно! У вас осталось ${--numberOfTries} попытки(а)\n")

        if (numberOfTries == 0) println("Доступ запрещён")

    } while (numberOfTries > 0 || answer == summand1 + summand2)

}






