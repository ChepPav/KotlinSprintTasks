package lesson_2

import kotlin.math.pow

const val AMOUNT_MONEY = 70_000
const val PERCENT_CONTRIBUTION: Double = 16.7 / 100
const val YEARS = 20

fun main() {
    val percentYear = ((1 + PERCENT_CONTRIBUTION).pow(YEARS))
    println("%.3f".format(AMOUNT_MONEY * percentYear))
}
