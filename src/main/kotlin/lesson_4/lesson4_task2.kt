package lesson_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {
    val firstCargoKillo = 20
    val firstCargoLiters = 80

    val secondCargoKillo = 50
    val secondCargoLitters = 100

    println("Груз с весом $firstCargoKillo кг и объемом $firstCargoLiters л соответствует категории 'Average':" +
            "${(firstCargoKillo > MIN_WEIGHT && firstCargoKillo <= MAX_WEIGHT && firstCargoLiters < MAX_VOLUME)}")
    println("Груз с весом $secondCargoKillo кг и объемом $secondCargoLitters л соответствует категории 'Average': " +
            "${(secondCargoKillo > MIN_WEIGHT && secondCargoKillo <= MAX_WEIGHT && secondCargoLitters < MAX_VOLUME)}")
}