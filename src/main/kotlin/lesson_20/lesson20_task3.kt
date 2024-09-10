package lesson_20

class Keymaster(var isHasKey: Boolean, )

fun main() {
    val keymaster = Keymaster(true, );

    {it : Keymaster -> if (it.isHasKey) println("Игрок открыл дверь") else println("Дверь заперта")}(keymaster)
}