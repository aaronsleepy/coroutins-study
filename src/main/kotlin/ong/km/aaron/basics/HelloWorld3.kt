package ong.km.aaron.basics

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val deferred: Deferred<Int> = async {
        loadData()
    }

    println("Waiting...")
    println(deferred.await())
    println("Done!")
}

suspend fun loadData(): Int {
    println("Loading...")
    delay(3000L)
    println("Loaded!")
    return 45
}