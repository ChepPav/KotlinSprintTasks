package lesson_2

const val NUMBER_OF_STUDENTS = 4
fun main() {
    val scoreStudentsFirst = 3f
    val scoreStudentsSecond = 4f
    val scoreStudentsThird = 3f
    val scoreStudentsFour = 5f
    val midleScore = ((scoreStudentsFirst+scoreStudentsSecond+scoreStudentsThird+scoreStudentsFour)/ NUMBER_OF_STUDENTS)
    println(midleScore)
}