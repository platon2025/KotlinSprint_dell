package lesson_02

/** Created by Platon2025 */

fun main() {

    val grades = listOf(3, 4, 3, 5)
    val averageGrade = grades.average()

//    можно и так, конечно :
//    val averageGrade = (3 + 4 + 3 + 5 ) / 4f

    println(averageGrade)
}