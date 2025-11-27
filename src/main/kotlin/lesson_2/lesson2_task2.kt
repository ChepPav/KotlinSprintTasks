package lesson_2

fun main() {
    val workerSalary = 30000
    val internSalary = 20000
    val workers = 50
    val interns = 20

    val workersSalary = workers * workerSalary
    val staffSalary = interns * internSalary + workersSalary
    val avarageSalary = staffSalary / (workers + interns)

    println("Зарплата постоянных сотрудников - $workersSalary")
    println("Зарплата всего штата - $staffSalary")
    println("Средняя зарплата сотрудника - $avarageSalary")
}