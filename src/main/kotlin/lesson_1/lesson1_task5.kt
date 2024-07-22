package lesson_1

fun main() {
    val secondsInMinute = 60
    val minutesInHour = 60
    val secondsInSpace = 6480

    val showHours = secondsInSpace / (secondsInMinute * minutesInHour)
    val showMinutes = secondsInSpace / secondsInMinute % minutesInHour
    val showSeconds = secondsInSpace % secondsInMinute

    println(String.format("%02d:%02d:%02d", showHours, showMinutes, showSeconds))
}