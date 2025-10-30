package org.example.Lesson_2

const val TIME_OF_WAY = 457
const val HOUR_IN_MINUTE = 60

fun main() {
    val hourOfDeparture = 9
    val minuteOfDeparture = 39

    val totalMinute = hourOfDeparture * HOUR_IN_MINUTE + TIME_OF_WAY + minuteOfDeparture

    val arrivalHour = totalMinute / HOUR_IN_MINUTE
    val arrivalMinute = totalMinute % HOUR_IN_MINUTE

    println("${"%02d".format(arrivalHour)}:${"%02d".format(arrivalMinute)}")
}