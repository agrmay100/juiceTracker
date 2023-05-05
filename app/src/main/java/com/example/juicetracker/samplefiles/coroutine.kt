package com.example.juicetracker.samplefiles

import kotlinx.coroutines.*


fun main() = runBlocking {
    print("main starts")
    val array =  arrayOf(1,2,3)
    print(array.contentToString())
    val name = 5
    name.

    joinAll(
        async { threadSwitchingCoroutine(1, 500) },
        async { threadSwitchingCoroutine(2, 300) }
    )
    println("main ends")
}

suspend fun threadSwitchingCoroutine(number: Int, delay: Long) {
    println("Coroutine $number starts work on ${Thread.currentThread().name}")
    delay(delay)
    println("Coroutine $number has finished on ${Thread.currentThread().name}")
}