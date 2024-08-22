package lesson_12

class WeatherEveryDay(
    var daytimeTemperature: Int,
    var nighttimeTemperature: Int,
    var precipitation: Boolean,
) {
    fun printWeather() {
        println(
            """
                Дневная температура: $daytimeTemperature°C
                Ночная температура: $nighttimeTemperature°C
                Осадки: ${if (precipitation) "Есть" else "Нет"}""".trimIndent()
        )
    }
}

fun main() {
    val august1 = WeatherEveryDay(
        daytimeTemperature = 21,
        nighttimeTemperature = 10,
        precipitation = true
    )

    println("Погода 1 августа:")
    august1.printWeather()

}