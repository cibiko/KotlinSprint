package org.example.Lesson_2

const val TWENTY_PER_CENT = 0.20

fun main() {
    val crystallineIronOre = 7
    val ironOre = 11

    val buffCrystallineIronOre = (crystallineIronOre * TWENTY_PER_CENT).toInt()
    val buffIronOre = (ironOre * TWENTY_PER_CENT).toInt()

    println("Бонусные кристалические руды: $buffCrystallineIronOre")
    println("Бонусные железные руды: $buffIronOre")
}