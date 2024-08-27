package lesson_15

interface Flyable {
    fun printInfoAboutFly() {
        println("Животное способно летать")
    }
}

interface Swimable {
    fun printInfoAboutSwim() {
        println("Животное способно плавать")
    }
}

abstract class Animal(val name: String) {
    fun printName() {
        println("$name:")
    }
}

class CrucianCarp : Animal("Карась"), Swimable
class Gull : Animal("Чайка"), Flyable
class Duck : Animal("Утка"), Flyable, Swimable

fun main() {

    val crucianCarp = CrucianCarp()
    crucianCarp.printName()
    crucianCarp.printInfoAboutSwim()
    println()

    val gull = Gull()
    gull.printName()
    gull.printInfoAboutFly()
    println()

    val duck = Duck()
    duck.printName()
    duck.printInfoAboutFly()
    duck.printInfoAboutSwim()

}