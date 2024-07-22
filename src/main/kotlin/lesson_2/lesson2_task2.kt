package lesson_2

fun main() {

    val numberOfStaff = 50
    val numberOfTrainees = 30
    val salaryStaffRub = 30000
    val salaryTraineeRub = 20000

    val salaryStaffSum = numberOfStaff * salaryStaffRub
    val salaryAllEmployees = numberOfStaff * salaryStaffRub + numberOfTrainees * salaryTraineeRub
    val salaryAverage = salaryAllEmployees / (numberOfStaff + numberOfTrainees)

    println(salaryStaffSum.toInt())
    println(salaryAllEmployees.toInt())
    println(salaryAverage.toInt())

}
