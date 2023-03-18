package ong.km.aaron.basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = launch {
        doJob()
    }
    println("Waiting")
    job.join()
    println("Done")
}

suspend fun doJob() {
    println("Working...")
    delay(3000L)
    println("Worked!")
}