package lesson_3


fun main() {
    val turnInfo = "D2-D4;0"
    val infoParts = turnInfo.split("-", ";")
    val startPosition = infoParts[0]
    val nextPosition = infoParts[1]
    val turnNumber = infoParts[2]
    println("Начальная позиция - $startPosition")
    println("Новая позиция - $nextPosition")
    println("Номер хода - $turnNumber")
}