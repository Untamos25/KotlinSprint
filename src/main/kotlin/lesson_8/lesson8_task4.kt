package lesson_8

import java.util.*

fun main() {

    val mash = arrayOf("Картофель", "Молоко", "Масло сливочное", "Соль")

    println("Для пюре нужны следующие ингредиенты:")
    for (i in mash) println(i)

    print("\nКакой ингредиент вы хотите заменить? ")
    val input = readln()
    val find = mash.find { it.equals(input, ignoreCase = true) }

    if (find == null) println("Такого ингредиента нет в рецепте")
    else {
        print("На какой продукт вы хотите заменить ингредиент $find? ")
        val replace =
            readln().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        mash[mash.indexOf(find)] = replace
        println("\nГотово! Вы сохранили следующий список: ")
        for (i in mash) println(i)
    }

}