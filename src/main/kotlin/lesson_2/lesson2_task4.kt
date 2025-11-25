package lesson_2

const val BUFF_TWENTY = 20f
const val CRYSTAL = 7
const val IRON_ORE = 11
fun main() {
    val buffMath: Float = (BUFF_TWENTY / 100)
    val buffCrystal = CRYSTAL * buffMath
    val buffIronOre = IRON_ORE * buffMath
    println("Бонусные кристалы - ${buffCrystal.toInt()}")
    println("Бонусная железная руда - ${buffIronOre.toInt()}")
}