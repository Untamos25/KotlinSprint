package lesson_17

class Ship(_name: String, var averageSpeed: Double, var homePort: String) {
    var name = _name
        set(value) = println("Нельзя менять имя корабля!")
}

fun main() {
    val ship1 = Ship("Скиталец", 22.0, "Исследовательская станция \"Одиссей\", Сатурн")

    println(ship1.name)
    ship1.name = "Вектор"
    println(ship1.name)
}