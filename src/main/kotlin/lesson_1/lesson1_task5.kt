package lesson_1

fun main() {
    val seconds = 6480
    val minutes = seconds/60
    val hours = minutes/60

    val remainSeconds = seconds%60
    val remainMinute = minutes%60
    println("%02d:%02d:%02d".format(hours, remainMinute, remainSeconds))
}