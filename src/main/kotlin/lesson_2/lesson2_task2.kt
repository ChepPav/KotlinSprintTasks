package lesson_2

const val WORKER_SALARY = 30000
const val INTERN_SALARY = 20000
fun main() {
    val workers = 50
    val interns = 20

    val workersSalary = workers * WORKER_SALARY
    val staffSalary = interns * INTERN_SALARY + workersSalary
    val avarageSalary = staffSalary / (workers + interns)

    println("Зарплата постоянных сотрудников - $workersSalary")
    println("Зарплата всего штата - $staffSalary")
    println("Средняя зарплата сотрудника - $avarageSalary")
}