package lesson_12

private const val DIFFERENCE_KELVIN_CELSIUS = 273

class WeatherData(
    _daytimeTemperatureKelvin: Int,
    _nighttimeTemperatureKelvin: Int,
    _precipitation: Boolean,
) {
    var daytimeTemperatureCelsius = _daytimeTemperatureKelvin - DIFFERENCE_KELVIN_CELSIUS
    var nighttimeTemperatureCelsius = _nighttimeTemperatureKelvin - DIFFERENCE_KELVIN_CELSIUS
    var precipitation = _precipitation

    init {
        println(
            """
                Дневная температура: $daytimeTemperatureCelsius°C
                Ночная температура: $nighttimeTemperatureCelsius°C
                Осадки: ${if (precipitation) "Есть" else "Нет"}""".trimIndent()
        )
    }
}

fun main() {
    println("Погода 1 августа:")
    val august1 = WeatherData(
        _daytimeTemperatureKelvin = 294,
        _nighttimeTemperatureKelvin = 283,
        _precipitation = true
    )

}