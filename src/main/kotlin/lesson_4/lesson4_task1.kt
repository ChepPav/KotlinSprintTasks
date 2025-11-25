package lesson_4

const val TABLES = 13
fun main() {
    val bookingToday = 13
    val bookingTomorrow = 9
    println("Доступность столиков на сегодня: ${TABLES > bookingToday}")
    println("Доступность столиков на сегодня: ${TABLES > bookingTomorrow}")
}