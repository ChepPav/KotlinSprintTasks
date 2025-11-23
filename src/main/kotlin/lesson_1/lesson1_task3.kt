package lesson_1

fun main(){
    val year = 1961
    // Использую String так-как нельзя через Int инициализировать число начинающиеся с 0, если это не Double
    var hour  = "09"
    var minute = "07"
    println("Год полета - $year\nВзлет - $hour:$minute")
    hour = "10"
    minute = "55"
    println("Посадка - $hour:$minute")
}