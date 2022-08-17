package com.qiantao.kotlinstudy.practice

class Student constructor(val id: String) {

    var name: String = ""
    var age: Int = 1

    constructor(id: String, name: String) : this(id) {
        this.name = name
    }

    constructor(id: String, age: Int) : this(id) {
        this.age = age
    }

    constructor(id: String, name: String, age: Int) : this(id) {
        this.name = name
        this.age = age
    }

    fun show() {
        println("id = $id, name = $name, age = $age")
    }

    fun found() {
        val list = listOf(21, 40, 11, 33, 78)
        val filter = list.filter {
            it % 3 == 0
        }.map {
            it + 3
        }.flatMap {
            listOf(it, 77)
        }
        filter.forEach {
            println(it)
        }
    }
}


fun main() {
    val student: Student = Student("12")
    student.found()
}