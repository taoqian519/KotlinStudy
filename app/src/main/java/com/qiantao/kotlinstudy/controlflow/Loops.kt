package com.qiantao.kotlinstudy.controlflow


fun main(args: Array<String>) {
    //为什么能够直接使用 listof 呢
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, its a $cake cake!")
    }

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
    for (animal in zoo) {
        println("Watch out, its a ${animal.name}")
    }
}

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {
    operator fun iterator() = animals.iterator()
}


