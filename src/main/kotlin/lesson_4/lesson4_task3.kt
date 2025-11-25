package lesson_4

const val GOOD_WEATHER = "Солнечно"
const val AWNING_OPEN = "Открыт"
const val AIR_HUMIDITY = 20
const val BAD_SEASON = "Зима"
fun main() {
    val weatherToday = "Солнечно"
    val awning = "Открыт"
    val airHumidity = 20
    val season = "Зима"
    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${weatherToday == GOOD_WEATHER && awning == AWNING_OPEN && airHumidity == AIR_HUMIDITY && season !== BAD_SEASON}"
    )
}