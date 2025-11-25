package lesson_3

const val FIRST_NAME = "Татьяна"
const val PATRONYMIC = "Сергеевна"
fun main() {
    var lastName = "Андреева"
    var age = 20
    println("$lastName $FIRST_NAME $PATRONYMIC $age лет")
    lastName = "Сидорова"
    age = 22
    println("$lastName $FIRST_NAME $PATRONYMIC $age года")
}