package org.example.Lesson_2

const val COUNT_STUDENT = 4

fun main() {
    val oneStudent = 3
    val twoStudent = 4
    val threeStudent = 3
    val fourStudent = 5

    val middleEstimation = (oneStudent + twoStudent + threeStudent + fourStudent) / COUNT_STUDENT.toFloat()

    println(middleEstimation)

}