package lesson_2

import kotlin.math.pow

private const val MAX_PERCENT = 100

fun main() {
    val initialAmount = 70000
    val interestRate = 16.7
    val depositPeriod = 20
    val numberOfAccrualsPerYear = 1

    val finalAmount = initialAmount * (1 + interestRate / MAX_PERCENT / numberOfAccrualsPerYear).pow(numberOfAccrualsPerYear * depositPeriod)

    println(String.format("%.03f", finalAmount))

}