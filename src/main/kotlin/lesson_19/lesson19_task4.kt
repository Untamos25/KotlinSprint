package lesson_19

enum class AmmoType(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank {
    private var currentAmmo: AmmoType? = null

    fun loadTheGun(ammoType: AmmoType) {
        currentAmmo = ammoType
    }

    fun shoot() {
        if (currentAmmo != null) println("Нанесено урона: ${currentAmmo!!.damage}")
        else println("Пушка танка не заряжена.")
    }
}

fun main() {

    val tank = Tank()

    tank.shoot()
    tank.loadTheGun(AmmoType.BLUE)
    tank.shoot()
    tank.loadTheGun(AmmoType.GREEN)
    tank.shoot()
    tank.loadTheGun(AmmoType.RED)
    tank.shoot()

}