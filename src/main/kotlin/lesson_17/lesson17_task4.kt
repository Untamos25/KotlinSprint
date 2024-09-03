package lesson_17

class Parcel(val number: Int, _currentLocation: String, var movementCounter: Int = 0, ) {
    var currentLocation = _currentLocation
        set(value) {
            field = value
            movementCounter++
        }

    fun printInfo() {
        println("Номер посылки: $number")
        println("Текущее местоположение: $currentLocation")
        println("Счётчик: $movementCounter")
        println()
    }
}

fun main() {
    val parcel1 = Parcel(12, "Москва")

    parcel1.printInfo()

    parcel1.currentLocation = "Санкт-Петербург"
    parcel1.printInfo()

    parcel1.currentLocation = "Новокузнецк"
    parcel1.printInfo()
}