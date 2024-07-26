package lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {

    val freeTablesToday = 0
    val freeTablesTomorrow = 4
    val reservationToday = NUMBER_OF_TABLES - freeTablesToday
    val reservationTomorrow = NUMBER_OF_TABLES - freeTablesTomorrow

    val isFreeToday = reservationToday < NUMBER_OF_TABLES
    val isFreeTomorrow = reservationTomorrow < NUMBER_OF_TABLES

    println("Доступность столиков на сегодня: $isFreeToday,\nДоступность столиков на завтра: $isFreeTomorrow")

}