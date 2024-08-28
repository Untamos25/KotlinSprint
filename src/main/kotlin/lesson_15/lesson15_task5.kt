package lesson_15

interface Movable {
    fun startEngine(carName: String) {
        println("Водитель автомобиля $carName заводит двигатель.")
    }

    fun move(carName: String) {
        println("Автомобиль $carName осуществляет движение в пункт назначения.")
    }

    fun turnOffEngine(carName: String) {
        println("Водитель останавливает автомобиль $carName и заглушает двигатель.")
    }
}

interface TransportPassengers {
    var currentNumberOfPassengers: Int
    val maxNumberOfPassengers: Int

    fun loadPassenger(
        carName: String,
        changeNumberOfPassengers: Int,
        currentNumberOfPassengers: Int,
        maxNumberOfPassengers: Int
    ) {
        this.currentNumberOfPassengers += changeNumberOfPassengers
        if (this.currentNumberOfPassengers <= maxNumberOfPassengers)
            print("$changeNumberOfPassengers чел. сели в автомобиль $carName. ")
        else print("Автомобиль $carName переполнен. ")
        println("Теперь людей в салоне: ${this.currentNumberOfPassengers}/$maxNumberOfPassengers")
    }

    fun unloadPassenger(
        carName: String,
        changeNumberOfPassengers: Int,
        currentNumberOfPassengers: Int
    ) {
        this.currentNumberOfPassengers -= changeNumberOfPassengers
        if (this.currentNumberOfPassengers >= 0)
            print("$changeNumberOfPassengers чел. вышли из автомобиля $carName. ")
        else print("Из автомобиля $carName не может выйти людей больше, чем есть внутри. ")
        println("Теперь людей в салоне: ${this.currentNumberOfPassengers}/$maxNumberOfPassengers")
    }
}

interface TransportCargo {
    var currentAmountOfCargo: Double
    val maxAmountOfCargo: Double

    fun loadCargo(
        carName: String,
        changeAmountOfCargo: Double,
        currentAmountOfCargo: Double,
        maxAmountOfCargo: Double
    ) {
        this.currentAmountOfCargo += changeAmountOfCargo
        if (currentAmountOfCargo <= maxAmountOfCargo)
            print("$changeAmountOfCargo т груза помещено в автомобиль $carName. ")
        else print("Превышен лимит груза. ")
        println("Теперь в автомобиле: ${this.currentAmountOfCargo}/$maxAmountOfCargo т груза.")
    }

    fun unloadCargo(
        carName: String,
        changeAmountOfCargo: Double,
        currentAmountOfCargo: Double,
        maxAmountOfCargo: Double
    ) {
        this.currentAmountOfCargo -= changeAmountOfCargo
        if (this.currentAmountOfCargo >= 0)
            print("$changeAmountOfCargo т выгружено из автомобиля $carName. ")
        else print("Невозможно извлечь из автомобиля $carName груза больше, чем есть внутри. ")
        println("Теперь в автомобиле: ${this.currentAmountOfCargo}/$maxAmountOfCargo т груза.")
    }
}

abstract class Name(val carName: String)

class Truck(
    val name: String,
    override var currentNumberOfPassengers: Int = 0,
    override val maxNumberOfPassengers: Int = 1,
    override var currentAmountOfCargo: Double = 0.0,
    override val maxAmountOfCargo: Double = 2.0,
) : Name(name), Movable, TransportCargo, TransportPassengers

class Car(
    val name: String,
    override var currentNumberOfPassengers: Int = 0,
    override val maxNumberOfPassengers: Int = 3,
) : Name(name), Movable, TransportPassengers


fun main() {
    val truck = Truck("ЗиЛ")
    val car1 = Car("Лада")
    val car2 = Car("Волга")
    var changeNumberOfPassengers: Int
    var changeAmountOfCargo: Double

    changeAmountOfCargo = 2.0
    truck.loadCargo(truck.name, changeAmountOfCargo, truck.currentAmountOfCargo, truck.maxAmountOfCargo)

    changeNumberOfPassengers = 1
    truck.loadPassenger(
        truck.name,
        changeNumberOfPassengers,
        truck.currentNumberOfPassengers,
        truck.maxNumberOfPassengers
    )

    println()
    truck.startEngine(truck.name)
    truck.move(truck.name)
    truck.turnOffEngine(truck.name)
    println()

    changeNumberOfPassengers = 1
    truck.unloadPassenger(truck.name, changeNumberOfPassengers, truck.currentNumberOfPassengers)

    changeAmountOfCargo = 2.0
    truck.unloadCargo(truck.name, changeAmountOfCargo, truck.currentAmountOfCargo, truck.maxAmountOfCargo)

    println()

    changeNumberOfPassengers = 3
    car1.loadPassenger(car1.name, changeNumberOfPassengers, car1.currentNumberOfPassengers, car1.maxNumberOfPassengers)

    println()
    car1.startEngine(car1.name)
    car1.move(car1.name)
    car1.turnOffEngine(car1.name)
    println()

    changeNumberOfPassengers = 3
    car1.unloadPassenger(car1.name, changeNumberOfPassengers, car1.currentNumberOfPassengers)

    println()

    changeNumberOfPassengers = 2
    car2.loadPassenger(car2.name, changeNumberOfPassengers, car2.currentNumberOfPassengers, car2.maxNumberOfPassengers)

    println()
    car2.startEngine(car2.name)
    car2.move(car2.name)
    car2.turnOffEngine(car2.name)
    println()

    changeNumberOfPassengers = 2
    car2.unloadPassenger(car2.name, changeNumberOfPassengers, car2.currentNumberOfPassengers)

}