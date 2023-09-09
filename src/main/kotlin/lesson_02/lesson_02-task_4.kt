package lesson_02

/** Created by Platon2025 */

fun main() {

    val stockCrystal = 7
    val stockFerrum = 11
    val buff = 20 // percents

    val upCrystal = stockCrystal * buff / 100
    val upFerrum = stockFerrum * buff / 100

    println("Прибавка кристаллов : $upCrystal")
    println("Прибавка железа : $upFerrum")

}