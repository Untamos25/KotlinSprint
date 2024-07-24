package lesson_4

const val FAVOURABLE_WEATHER_SUNNY = true
const val FAVOURABLE_AWNING_OPEN = true
const val FAVOURABLE_AIR_HUMIDITY_PERCENT = 20
val favourableSeason = arrayOf("весна", "лето", "осень")

fun main() {

    val isCurrentWeatherSunny = true
    val isAwningOpen = true
    val currentAirHumidityPercent = 20
    val currentSeason = "зима"

    val isFavourableConditions = (isCurrentWeatherSunny == FAVOURABLE_WEATHER_SUNNY) &&
            (isAwningOpen == FAVOURABLE_AWNING_OPEN) &&
            (currentAirHumidityPercent == FAVOURABLE_AIR_HUMIDITY_PERCENT) &&
            (favourableSeason.contains(currentSeason))

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavourableConditions")

}
