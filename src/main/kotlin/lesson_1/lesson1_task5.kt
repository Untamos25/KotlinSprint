package lesson_1

fun main() {

    val timeInSpace = 6480
    val hour = timeInSpace / 3600
    val minute = timeInSpace / 60 % 60
    val second = timeInSpace % 60

    if (hour in 0..9) print("0$hour:")
    else print("$hour:")

    if (minute in 0..9) print("0$minute:")
    else print("$minute:")

    if (second in 0..9) print("0$second")
    else print(second)

}