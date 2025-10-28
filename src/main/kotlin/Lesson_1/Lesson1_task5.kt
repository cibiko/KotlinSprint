package org.example.Lesson_1

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {
    val totalSeconds= 6480
    val hourOfFlight = totalSeconds / SECONDS_IN_HOUR
    val remainingTotalSeconds = totalSeconds % SECONDS_IN_HOUR
    val minuteOfFlight = remainingTotalSeconds / SECONDS_IN_MINUTE
    val secondsOfFlight = remainingTotalSeconds % SECONDS_IN_MINUTE

    val timeFormatted = ("%02d:%02d:%02d".format(hourOfFlight, minuteOfFlight, secondsOfFlight))

    print(timeFormatted)
}