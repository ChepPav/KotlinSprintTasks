package lesson_1

const val SIXTY = 60
fun main() {
    val seconds = 6480
    val minutes = seconds / SIXTY
    val hours = minutes / SIXTY

    val remainingSeconds = seconds % SIXTY
    val remainingMinute = minutes % SIXTY
    println("%02d:%02d:%02d".format(hours, remainingMinute, remainingSeconds))
}