package com.qiantao.kotlinstudy.specialclasses

import java.util.*


class LuckDispatcher {
    fun getNumber() {
        val objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun main() {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()
    rentPrice(10, 2, 1)
    DoAuth.takeParams("taoqian","123456")

    BigBen.getBongs(12)
}

fun rentPrice(standarDays: Int, festivityDays: Int, specialDays: Int): Unit {
    val dayRates = object {
        var standard: Int = 30 * standarDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays

        val key = test()
        fun test(): String {
            return "test"
        }
    }
    val total = dayRates.standard + dayRates.festivity + dayRates.special
    println("Total price:$$total")
    dayRates.test()
}

object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                print("BONG ")
            }
        }
    }
}



