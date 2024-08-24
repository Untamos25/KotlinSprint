package lesson_14

open class Liner(
    val speed: Int = 20,
    val loadCapacity: Int = 20,
    val numberOfPassengers: Int = 40
)

class Cargo(
    speed: Int = 10,
    loadCapacity: Int = 40,
    numberOfPassengers: Int = 20
) : Liner(
    speed,
    loadCapacity,
    numberOfPassengers,
)

class Icebreaker(
    speed: Int = 5,
    loadCapacity: Int = 5,
    numberOfPassengers: Int = 10,
    val isCapableOfBreakingIce: Boolean = true,
) : Liner(
    speed,
    loadCapacity,
    numberOfPassengers,
)

fun main() {
    val liner = Liner()
    val cargo = Cargo()
    val icebreaker = Icebreaker()

}