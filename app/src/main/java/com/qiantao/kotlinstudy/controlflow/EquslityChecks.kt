package com.qiantao.kotlinstudy.controlflow


fun main() {
    val authors = setOf("Shakesprare", "Hemingway", "Twain")
    val writers = setOf("Hemingway", "Shakesprare", "Twain")

    println(authors == writers)
    println(authors === writers)

    fun max(a: Int, b: Int) = if (a > b) a else b

    println(max(1, 2))
}