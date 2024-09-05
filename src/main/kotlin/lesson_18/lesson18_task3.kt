package lesson_18

abstract class Animal(val name: String) {
    abstract fun eat()
    fun sleep() {
        println("$name -> спит")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}


fun main() {
    val fox = Fox("Алиса")
    val dog = Dog("Хаул")
    val cat = Cat("Клякса")

    val listOfAnimals : List<Animal> = listOf(fox, dog, cat)

    listOfAnimals.forEach {
        it.eat()
    }
}