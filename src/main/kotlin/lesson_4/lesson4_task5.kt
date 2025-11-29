package lesson_4

const val SHIP_CONDITION = true
const val MIN_CREW_NUMBERS = 55
const val MAX_CREW_NUMBERS = 70
const val PROVISIONS = 50
const val GOOD_WEATHER = true

fun main() {
    println("Отсутствую ли на корабль повреждения? Ввести \"true\" или \"false\"")
    val hasNoDamage = readln().toBoolean()
    println("Количество экипажа? Ввести число")
    val actualCrewNumber = readln().toInt()
    println("Количество провизии? Ввести число")
    val actualProvisions = readln().toInt()
    println("Хорошая ли погода? Ввести \"true\" или \"false\"")
    val isWeatherGood = readln().toBoolean()

    println(
        """
        Может ли корабль выйти в плавание? 
        ${
            hasNoDamage == SHIP_CONDITION &&
                    actualCrewNumber in MIN_CREW_NUMBERS..MAX_CREW_NUMBERS &&
                    actualProvisions > PROVISIONS ||
                    (hasNoDamage != SHIP_CONDITION &&
                            actualCrewNumber == MAX_CREW_NUMBERS &&
                            actualProvisions >= PROVISIONS &&
                            isWeatherGood == GOOD_WEATHER)
        }
    """.trimIndent()
    )
}