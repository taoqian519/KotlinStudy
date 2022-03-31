package com.qiantao.kotlinstudy.controlflow

//为什么方法可以直接定义，而不需要在类里面
fun main() {
    for (i in 0..3) {
        print(i)
    }
    print(" ")

    for (i in 0 until 3) {
        print(i)
    }
    print(" ")

    for (i in 2..8 step 2) {
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {
        print(i)
    }
    print(" ")

    for (c in 'a'..'d') {
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) {
        print(c)
    }
    print(" ")

    val x = 2
    if (x in 1..5) {
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {
        print(" x is not in range from 6 to 10")
    }
}