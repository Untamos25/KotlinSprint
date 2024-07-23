package lesson_1

    const val SECONDS_IN_MINUTE = 60
    const val MINUTES_IN_HOUR = 60

fun main() {
    val secondsInSpace = 6480

    val showHours = secondsInSpace / (SECONDS_IN_MINUTE * MINUTES_IN_HOUR)
    val showMinutes = secondsInSpace / SECONDS_IN_MINUTE % MINUTES_IN_HOUR
    val showSeconds = secondsInSpace % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", showHours, showMinutes, showSeconds))
}