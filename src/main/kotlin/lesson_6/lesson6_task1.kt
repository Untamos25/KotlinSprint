package lesson_6

fun main() {

    var userLoginReg: String
    var userPassReg: String

    println("Регистрация нового аккаунта.")

    do {
        print("Введите логин: ")
        userLoginReg = readln()
        print("Введите пароль: ")
        userPassReg = readln()
        if (userLoginReg == "" || userPassReg == "")
            println("Поля логин и пароль не могут быть пустыми!")
    } while (userLoginReg == "" || userPassReg == "")

    println("Регистрация завершена.\nВведите логин и пароль для авторизации.")

    do {
        print("Введите логин: ")
        val userLoginAuth = readln()
        print("Введите пароль: ")
        val userPassAuth = readln()
        if (userLoginReg != userLoginAuth || userPassReg != userPassAuth)
            println("Введён неверный логин или пароль. Повторите попытку.")
    } while (userLoginReg != userLoginAuth || userPassReg != userPassAuth)

    println("Авторизация прошла успешно.")

}