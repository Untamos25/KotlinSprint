package lesson_14

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isLandable: Boolean,
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
    val satellites: List<Satellite> = listOf()
) : CelestialBody(
    name,
    hasAtmosphere,
    isLandable,
) {
    fun printInfoAboutPlanet() {
        println("Планета \"${name}\"")
        if (satellites.isNotEmpty()) {
            println("Её спутники:")
            satellites.forEach {
                println(" - ${it.name}")
            }
        } else println("Эта планета не имеет спутников.")
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
) : CelestialBody(
    name,
    hasAtmosphere,
    isLandable,
)

fun main() {

    val satellite1 = Satellite(name = "Фобос", hasAtmosphere = false, isLandable = true)
    val satellite2 = Satellite(name = "Деймос", hasAtmosphere = false, isLandable = true)

    val planet1 = Planet(
        name = "Марс",
        hasAtmosphere = false,
        isLandable = true,
        satellites = listOf(satellite1, satellite2)
    )

    planet1.printInfoAboutPlanet()

}
