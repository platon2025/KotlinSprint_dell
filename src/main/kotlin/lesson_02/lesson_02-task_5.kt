package lesson_02

/** Created by Platon2025 */

fun main() {
    val initAmount = 70_000
    val rate = 16.7
    val years = 20
    var currentAmount: Double = initAmount.toDouble()

    for(a in 1..years){
        currentAmount += currentAmount * rate / 100
    }

    val outputString = (currentAmount * 1000).toInt().toDouble()/1000 // офигенно элегантно =)

    println (outputString)
}