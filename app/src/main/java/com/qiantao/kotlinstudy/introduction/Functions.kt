package com.qiantao.kotlinstudy.introduction


class Functions {
    fun printMessage(messge: String): Unit {
        println(messge)
    }

    fun printMessageWithPrefix(messge: String, prefix: String = "Info") {
        println("[$prefix] $messge")
    }

    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun multiply(x: Int, y: Int) = x * y

    fun main() {
        infix fun Int.times(str: String) = str.repeat(this)
        println(2 times "Bye ")

        val pair = "Ferrari" to "katrina"
        println(pair)

        infix fun String.onto(other: String) = Pair(this, other)
        val myPair = "Mclaren" onto "Lucas"
        println(myPair)

        val sophia = Person("Sophia")
        val claudia = Person("Claudia")
        sophia likes claudia

    }

    fun op() {
        operator fun Int.times(str: String) = str.repeat(this)
        println(2 * "Bye ")
    }

    class Person(val name: String) {
        val likedPeople = mutableListOf<Person>()
        infix fun likes(other: Person) {
            likedPeople.add(other)
        }
    }


}