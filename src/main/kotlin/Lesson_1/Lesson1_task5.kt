package org.example.Lesson_1

const val totalSeconds = 6480
const val secondsInHour = 3600
const val secondsInMinute = 60

fun main() {
    val hourOfFlight = totalSeconds / secondsInHour
    val remainingTotalSeconds = totalSeconds % secondsInHour
    val minuteOfFlight = remainingTotalSeconds / secondsInMinute
    val secondsOfFlight = remainingTotalSeconds % secondsInMinute

    val timeFormatted = ("%02d:%02d:%02d".format(hourOfFlight, minuteOfFlight,secondsOfFlight))

    print(timeFormatted)
}