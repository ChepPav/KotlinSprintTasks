package lesson_3

fun main() {
    var startPosition = "E2"
    var nextPosition = "E4"
    var turnNumber = 1
    var playerColor = "белые"
    println("Ход под номером $turnNumber, ходят $playerColor из $startPosition в $nextPosition ")
    startPosition = "D2"
    nextPosition = "D3"
    turnNumber++
    playerColor = "черные"
    println("Ход под номером $turnNumber, ходят $playerColor из $startPosition в $nextPosition ")

}