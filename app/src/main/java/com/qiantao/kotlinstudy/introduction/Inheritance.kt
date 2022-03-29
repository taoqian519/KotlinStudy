package com.qiantao.kotlinstudy.introduction


open class Dog {
    open fun sayHello() {
        println("wow wow!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }

    fun jump() {
        println("jump")
    }
}

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")


open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says:graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")


fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()

    val dog1 = Dog()
    dog1.sayHello()

    val dog2 = Yorkshire()
    dog2.sayHello()

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}