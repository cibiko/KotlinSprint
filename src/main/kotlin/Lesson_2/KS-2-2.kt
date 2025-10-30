package org.example.Lesson_2



fun main() {
    val earnRegularWorker = 30000
    val earnInternWorker = 20000
    val regularWorkers = 50
    val internWorkers = 30

    val totalWorkers = regularWorkers + internWorkers
    val costsOfRegularWorkers = earnRegularWorker * regularWorkers
    val costsOfInternWorkers = earnInternWorker * internWorkers
    val totalCost = costsOfRegularWorkers + costsOfInternWorkers
    val middleIncome = totalCost / totalWorkers

    println(costsOfRegularWorkers)
    println(totalCost)
    println(middleIncome)
}