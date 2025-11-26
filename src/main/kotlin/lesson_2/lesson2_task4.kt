package lesson_2

fun main() {
    val buffTwenty = 20f
    val crystal = 7
    val ironOre = 11

    val buffMath: Float = (buffTwenty / 100)
    val buffCrystal = crystal * buffMath
    val buffIronOre = ironOre * buffMath
    println("Бонусные кристалы - ${buffCrystal.toInt()}")
    println("Бонусная железная руда - ${buffIronOre.toInt()}")
}