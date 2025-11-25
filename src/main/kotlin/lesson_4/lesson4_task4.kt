package lesson_4

fun main() {
    val trainingDay = 5
    val armsExercises = trainingDay % 2 == 1
    println(
        """
        Упражнения для рук:    $armsExercises
        Упражнения для ног:    ${!armsExercises}
        Упражнения для спины:  ${!armsExercises}
        Упражнения для пресса: $armsExercises
    """.trimIndent()
    )
}