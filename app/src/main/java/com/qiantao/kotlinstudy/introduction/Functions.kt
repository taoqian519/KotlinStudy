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

        printAll("Hello", "Hallo", "Salut", "Hola", "你好")
    }

    fun printAllWithPrefix(vararg entries: String) {
        printAll(*entries)
    }

    fun op() {
        operator fun Int.times(str: String) = str.repeat(this)
        println(2 * "Bye ")

        operator fun String.get(range: IntRange) = substring(range)
        val str = "Always forgive your enemies; nothing annoys them so much"
        println(str[0..14])
    }

    fun printAll(vararg messges: String) {
        for (m in messges) println(m)
    }

    class Person(val name: String) {
        val likedPeople = mutableListOf<Person>()
        infix fun likes(other: Person) {
            likedPeople.add(other)
        }
    }


}