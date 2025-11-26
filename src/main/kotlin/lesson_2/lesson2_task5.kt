package lesson_2

import kotlin.math.pow

fun main() {
    val amountMoney = 70_000
    val percentContribution: Double = 16.7 / 100
    val years = 20

    val percentYear = ((1 + percentContribution).pow(years))
    println("%.3f".format(amountMoney * percentYear))
}
