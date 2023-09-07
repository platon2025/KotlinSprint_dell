package lesson_01

/** Created by Platon2025 */

fun main() {
    val totalSeconds = 6480 //108 минут

    val seconds = totalSeconds % 60 //количество секунд в конечном реультате
    val totalMinutes = totalSeconds / 60
    val minutes = totalMinutes % 60 //количество минут в конечном реультате
    val hours = totalMinutes / 60

    val string = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(string)

}