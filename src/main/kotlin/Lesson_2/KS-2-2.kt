package org.example.Lesson_2

const val EARN_REGULAR_WORKER = 30000
const val EARN_INTERN_WORKER = 20000

fun main() {
    val regularWorker = 50
    val internWOrker = 30
    val totalWorkers = regularWorker + internWOrker
    val costsOfRegularWorkers = EARN_REGULAR_WORKER * regularWorker
    val costsOfInternWorkers = EARN_INTERN_WORKER * internWOrker
    val totalCost = costsOfRegularWorkers + costsOfInternWorkers
    val middleIncome = totalCost / totalWorkers

    println(costsOfRegularWorkers)
    println(totalCost)
    println(middleIncome)

}