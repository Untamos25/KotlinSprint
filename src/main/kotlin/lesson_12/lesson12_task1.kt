package lesson_12

class DailyWeather {
    var daytimeTemperature = 0
    var nighttimeTemperature = 0
    var precipitation = false

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
    val august1 = DailyWeather()
    august1.daytimeTemperature = 21
    august1.nighttimeTemperature = 10
    august1.precipitation = true

    val august2 = DailyWeather()
    august2.daytimeTemperature = 23
    august2.nighttimeTemperature = 12
    august2.precipitation = false

    println("Погода 1 августа:")
    august1.printWeather()
    println()
    println("Погода 2 августа:")
    august2.printWeather()

}