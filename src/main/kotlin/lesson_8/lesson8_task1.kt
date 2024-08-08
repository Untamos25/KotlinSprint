package lesson_8

fun main() {

    val weeklyViews = arrayOf(0, 0, 0, 0, 0, 0, 0)
    var sum = 0

    println("Количество просмотров:")
    for (i in weeklyViews.indices) {
        weeklyViews[i] = (100..1000).random() // генерация случайного числа просмотров и запись его в массив
        println("${i + 1}-й день недели: ${weeklyViews[i]}")
        sum += weeklyViews[i]
    }
    println("Всего просмотров за неделю: $sum")

}