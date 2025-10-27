package org.example.Lesson_1

fun main() {
    val totalSeconds = 6480
    val hourOfFlight = totalSeconds / 3600
    val remainingTotalSeconds = totalSeconds % 3600
    val minuteOfFlight = remainingTotalSeconds / 60
    val secondsOfFlight = remainingTotalSeconds % 60

    val timeFormatted = String.format("%02d:%02d:%02d", hourOfFlight, minuteOfFlight, secondsOfFlight)

    print(timeFormatted)
}