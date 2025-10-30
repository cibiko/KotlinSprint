package org.example.Lesson_2


const val MINUTE_IN_HOUR = 60

fun main() {
    val timeOfWay = 457
    val hourOfDeparture = 9
    val minuteOfDeparture = 39

    val totalMinute = hourOfDeparture * MINUTE_IN_HOUR + timeOfWay + minuteOfDeparture

    val arrivalHour = totalMinute / MINUTE_IN_HOUR
    val arrivalMinute = totalMinute % MINUTE_IN_HOUR

    println("%02d:%02d".format(arrivalHour, arrivalMinute))
}