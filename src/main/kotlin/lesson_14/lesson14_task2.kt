package lesson_14

open class LinerShip(
    val speed: Int = 20,
    val loadCapacity: Int = 20,
    val numberOfPassengers: Int = 40
) {
    open fun loadCargo() {
        println("Погрузка: выдвинуть горизонтальный трап со шкафута.")
    }
}

class CargoShip(
    speed: Int = 10,
    loadCapacity: Int = 40,
    numberOfPassengers: Int = 20
) : LinerShip(
    speed,
    loadCapacity,
    numberOfPassengers,
) {
    override fun loadCargo() {
        println("Погрузка: активировать погрузочный кран.")
    }
}

class IcebreakerShip(
    speed: Int = 5,
    loadCapacity: Int = 5,
    numberOfPassengers: Int = 10,
    val isCapableOfBreakingIce: Boolean = true,
) : LinerShip(
    speed,
    loadCapacity,
    numberOfPassengers,
) {
    override fun loadCargo() {
        println("Погрузка: открыть ворота со стороны кормы.")
    }
}

fun main() {
    val liner = LinerShip()
    val cargoShip = CargoShip()
    val icebreaker = IcebreakerShip()

    println(
        """Лайнер: 
        |Скорость: ${liner.speed} 
        |Грузоподъёмность: ${liner.loadCapacity}
        |Максмальное количество пассажиров: ${liner.numberOfPassengers}""".trimMargin()
    )
    liner.loadCargo()

    println()

    println(
        """Грузовой корабль: 
        |Скорость: ${cargoShip.speed} 
        |Грузоподъёмность: ${cargoShip.loadCapacity}
        |Максмальное количество пассажиров: ${cargoShip.numberOfPassengers}""".trimMargin()
    )
    cargoShip.loadCargo()

    println()

    println(
        """Ледокол: 
        |Скорость: ${icebreaker.speed} 
        |Грузоподъёмность: ${icebreaker.loadCapacity}
        |Максмальное количество пассажиров: ${icebreaker.numberOfPassengers}
        |Способен колоть лёд: ${icebreaker.isCapableOfBreakingIce}""".trimMargin()
    )
    icebreaker.loadCargo()
}