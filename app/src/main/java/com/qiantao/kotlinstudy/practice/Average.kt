package com.qiantao.kotlinstudy.practice

class Average private constructor(){

    constructor(int: String) : this() {

    }
}

fun main() {
    averageList()
}

fun averageArray() {
    val array = Array(100000) { it * 1 }

    val curTime = System.currentTimeMillis()

    var count = 0L
    array.forEach {
        count += it
    }
    val average = count / 100000

    println(average)
    println((System.currentTimeMillis() - curTime))
}

fun averageIntArray() {
    val intArray = IntArray(100000) { it * 1 }
    val curTime = System.currentTimeMillis()

    var count = 0L
    intArray.forEach {
        count += it
    }
    val average = count / 100000

    println(average)
    println((System.currentTimeMillis() - curTime))
}

fun averageList() {
    val list = (0..100000).toList()

    val curTime = System.currentTimeMillis()

    var count = 0L
    list.forEach {
        count += it
    }
    val average = count / 100000

    println(average)
    println((System.currentTimeMillis() - curTime))
}