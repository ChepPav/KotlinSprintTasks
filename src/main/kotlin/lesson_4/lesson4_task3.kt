package lesson_4

const val GOOD_WEATHER = true
const val AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val BAD_SEASON = "Зима"

fun main() {
    val isSunnyWeather = true
    val isAwningOpen = true
    val airHumidity = 20
    val season = "Зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${isSunnyWeather == GOOD_WEATHER && isAwningOpen == AWNING_OPEN && airHumidity == AIR_HUMIDITY && season != BAD_SEASON}"
    )
}