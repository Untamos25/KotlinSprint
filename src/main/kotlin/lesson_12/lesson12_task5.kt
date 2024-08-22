package lesson_12

private const val PERIOD_DAYS = 30

class DayWeather(
    var daytimeTemperature: Int,
    var nighttimeTemperature: Int,
    var isPrecipitation: Boolean,
)

fun main() {
    val monthlyWeather = mutableListOf<DayWeather>()
    for (i in 0..<PERIOD_DAYS) {
        val weatherOfDay = DayWeather(
            daytimeTemperature = (15..40).random(),
            nighttimeTemperature = (0..25).random(),
            isPrecipitation = (0..1).random() == 1,
        )
        monthlyWeather.add(i, weatherOfDay)
    }

    val daytimeTemperatures = mutableListOf<Int>()
    val nighttimeTemperatures = mutableListOf<Int>()
    for (i in monthlyWeather) {
        daytimeTemperatures.add(i.daytimeTemperature)
        nighttimeTemperatures.add(i.nighttimeTemperature)
    }

    val daysWithPrecipitation = mutableListOf<Int>()
    for (i in monthlyWeather.indices) {
        if (monthlyWeather[i].isPrecipitation) daysWithPrecipitation.add(i + 1)
    }

    println("Погода за указанный период в $PERIOD_DAYS дней:")

    val averageDaytimeTemperature = String.format("%.2f", daytimeTemperatures.average())
    println("Средняя дневная температура: $averageDaytimeTemperature °C")

    val averageNighttimeTemperature = String.format("%.2f", nighttimeTemperatures.average())
    println("Средняя ночная температура: $averageNighttimeTemperature °C")

    val numberOfDaysWithPrecipitation = daysWithPrecipitation.size
    println("Количество дней с осадками: $numberOfDaysWithPrecipitation")

}