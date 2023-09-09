package lesson_02

/** Created by Platon2025 */

const val MINUTES_PER_HOUR = 60
const val HOURS_PER_DAY = 24

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val travelMinutes = 457

    val arriveMinutesFrom00 = departureHour * MINUTES_PER_HOUR + departureMinute + travelMinutes
    val arriveMinutes = arriveMinutesFrom00 % MINUTES_PER_HOUR
    val arriveHours = arriveMinutesFrom00 / MINUTES_PER_HOUR % HOURS_PER_DAY

    val arriveTime = String.format("%1d:%02d", arriveHours, arriveMinutes)
    println("Время прибытия: $arriveTime")

}