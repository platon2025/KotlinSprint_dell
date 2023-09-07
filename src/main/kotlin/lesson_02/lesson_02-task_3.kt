package lesson_02

/** Created by Platon2025 */

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelMinutes = 457

    val arriveMinutesFrom00 = departureHour * 60 + departureMinute + travelMinutes
    val arriveMinutes = arriveMinutesFrom00 % 60
    val arriveHours = arriveMinutesFrom00 / 60 % 24

    val arriveTime = String.format("%1d:%02d", arriveHours, arriveMinutes)
    println("Время прибытия: $arriveTime")

}