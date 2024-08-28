package lesson_15

abstract class WeatherStationStats(val value: Double)

class Temperature(value: Double) : WeatherStationStats(value)
class PrecipitationAmount(value: Double) : WeatherStationStats(value)

class WeatherServer {
    fun sendData(dataType: WeatherStationStats) {
        when (dataType) {
            is Temperature -> println("Отправлены данные: Температура ${dataType.value} °C")
            is PrecipitationAmount -> println("Отправлены данные: Осадки ${dataType.value} мм")
        }
    }
}

fun main() {
    val server = WeatherServer()

    val dayTemperature1 = Temperature(25.3)
    val dayPrecipitationAmount1 = PrecipitationAmount(10.2)

    server.sendData(dayTemperature1)
    server.sendData(dayPrecipitationAmount1)
}