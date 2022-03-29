package com.qiantao.kotlinstudy.controlflow


fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
    cases(null)

    println(whenAssign("Hello"))
    println(whenAssign(4L))
}

fun cases(obj: Any?) {
    when (obj) {
        1 -> println("One")
        "hello" -> println("Greeting")
        is Long -> println("Long")
        null -> println(null)
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

class MyClass

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        is MyClass -> "MyClass"
        else -> 42
    }
    return result
}