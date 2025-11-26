package lesson_2

const val SIXTY = 60

fun main() {
    val trainDepartureHours = 9
    val trainDepartureMinute = 39
    val trainTravelMinute = 457

    val totalMinute = trainTravelMinute + trainDepartureMinute
    val remainingMinuteInWay = totalMinute % SIXTY

    val hoursInWay = totalMinute / SIXTY
    val arrivalHours = trainDepartureHours + hoursInWay

    println("%02d:%02d".format(arrivalHours, remainingMinuteInWay))

}
