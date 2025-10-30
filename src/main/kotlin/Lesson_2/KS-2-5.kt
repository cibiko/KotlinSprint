package org.example.Lesson_2

import kotlin.math.pow

const val PER_CENT = 100

fun main() {
    val amountOfPayment = 70_000.0
    val interestRate = 16.7 / PER_CENT
    val numberOfChargesOfYear = 1
    val periodOfDeposit = 20

    val totalAmount = amountOfPayment * (1 + interestRate / numberOfChargesOfYear).pow(numberOfChargesOfYear * periodOfDeposit)

    println("%.3f".format(totalAmount))
}