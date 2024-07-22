package lesson_2

fun main() {

    val minutesInHour = 60
    val departureTimeHours = 9
    val departureTimeMinutes = 39
    val travelTimeMinutes = 457

    val travelTimeHours = (departureTimeMinutes + travelTimeMinutes) / minutesInHour
    val arrivalMinutes = (departureTimeMinutes + travelTimeMinutes) % minutesInHour
    val arrivalHours = departureTimeHours + travelTimeHours

    println(String.format("%02d:%02d", arrivalHours, arrivalMinutes))

}