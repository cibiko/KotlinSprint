package org.example.Lesson_2

const val MAX_PER_CENT = 100
const val TWENTY_PER_CENT = 20

fun main() {
    val crystallineIronOre = 7
    val ironOre = 11

    val buffCrystallineIronOre = (crystallineIronOre / MAX_PER_CENT.toFloat() * TWENTY_PER_CENT).toInt()
    val buffIronOre = (ironOre / MAX_PER_CENT.toFloat() * TWENTY_PER_CENT).toInt()

    println("Бонусные кристалические руды: $buffCrystallineIronOre")
    println("Бонусные железные руды: $buffIronOre")
}