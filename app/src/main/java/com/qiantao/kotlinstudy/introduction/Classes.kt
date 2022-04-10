package com.qiantao.kotlinstudy.introduction


class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()
    val contact = Contact(1, "tao.qian@ubtrobot.com")
    println(contact.id)
    contact.email = "tao.qian@test.com"

    val initOrderDemo1 = InitOrderDemo("demo1","type1")
    val initOrderDemo2 = InitOrderDemo("demo2")
    val initOrderDemo3 = InitOrderDemo()

}

interface Polygon {
    fun draw() {
        println("draw Polygon")
    }
}

class Square() : Rectangle(), Polygon {
    override fun draw() {
        super<Polygon>.draw()
        super<Rectangle>.draw()
    }
}

open class InitOrderDemo constructor(name: String = "taoqian") {

    constructor(name: String, type: String) : this(name) {
        println("name=$name,type=$type")
    }

    val firstProperty = "First property: $name".also(::println)

    open fun test() {

    }

    init {
        println("init1,$name")
    }

    init {
        println("init2,$name")
    }
}

class Test(name: String) : InitOrderDemo(name) {

    override fun test() {
        super.test()
    }
}

open class Rectangle {
    open fun draw() { println("Drawing a rectangle")}
    val borderColor: String get() = "black"
    val name: String = "Rectangle"
}

class FilledRectangle : Rectangle() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }

    val fillColor: String get() = super.borderColor

    inner class Filler {
        fun fill() { println("Filling") }

        fun drawAndFill() {
            super@FilledRectangle.draw()
            fill()
            println("${super@FilledRectangle.borderColor}")
        }
    }


}
