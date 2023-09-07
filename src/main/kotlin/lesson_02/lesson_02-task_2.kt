package lesson_02

/** Created by Platon2025 */

fun main() {
    val numberOfRegular = 50
    val salaryRegular = 30_000
    val numberOfTrainee = 30
    val salaryTrainee = 20_000

    val payrollRegular = salaryRegular * numberOfRegular
    val payrollTotal = salaryRegular * numberOfRegular + salaryTrainee * numberOfTrainee
    val salaryAverage = payrollTotal / ( numberOfRegular + numberOfTrainee )

    println(payrollRegular)
    println(payrollTotal)
    println(salaryAverage)

}