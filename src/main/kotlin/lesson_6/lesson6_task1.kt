package lesson_6

fun main() {
    var userLoginReg = ""
    var userPassReg = ""
    var userLoginAuth = ""
    var userPassAuth = ""

    println("Регистрация нового аккаунта.")

    while (userLoginReg == "" || userPassReg == "") {
        print("Введите логин: ")
        userLoginReg = readln()
        print("Введите пароль: ")
        userPassReg = readln()
        if (userLoginReg == "" || userPassReg == "")
            println("Поля логин и пароль не могут быть пустыми!")
    }

    println("Регистрация завершена.\nВведите логин и пароль для авторизации.")

    while (userLoginReg != userLoginAuth || userPassReg != userPassAuth) {
        print("Введите логин: ")
        userLoginAuth = readln()
        print("Введите пароль: ")
        userPassAuth = readln()
        if (userLoginReg != userLoginAuth || userPassReg != userPassAuth)
            println("Введён неверный логин или пароль. Повторите попытку.")
    }

    println("Авторизация прошла успешно.")

}