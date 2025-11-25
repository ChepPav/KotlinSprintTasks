package lesson_2

const val TRAIN_DEPARTURE_HOURS = 9
const val TRAIN_DEPARTURE_MINUTE = 39
const val TRAIN_TRAVEL_MINUTE = 457
const val SIXTY = 60

fun main() {
    val totalMinuts = TRAIN_TRAVEL_MINUTE + TRAIN_DEPARTURE_MINUTE
    val remainingMinuteInWay = totalMinuts % SIXTY

    val hoursInWay = totalMinuts / SIXTY
    val arravingHours = TRAIN_DEPARTURE_HOURS + hoursInWay

    println("%02d:%02d".format(arravingHours, remainingMinuteInWay))

}
