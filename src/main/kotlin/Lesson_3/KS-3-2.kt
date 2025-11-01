package org.example.Lesson_3

fun main() {
    var userAge = "20"
    val userName = "Татьяна"
    var userMiddleName = "Андреева"
    val userLastName = "Сергеевна"
    println("$userMiddleName $userName $userLastName, $userAge")

    userAge = "22"
    userMiddleName = "Сидорова"
    println("$userMiddleName $userName $userLastName, $userAge")
}