package com.qiantao.kotlinstudy.introduction

class MutableSta<E>(vararg items: E) {

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString(): String {
        return "MutableSta(${elements.joinToString()})"
    }
}

fun <K> mutableStackOf(vararg elements: K) = MutableSta(*elements)

fun <E> mutableStackOf1(vararg elements: E): MutableSta<E> {
    return MutableSta(*elements)
}

fun main() {
    val stack = mutableStackOf(0.62, 3.14, 2.3)

    val stack1 = MutableSta("hello", "ni hao")
    println(stack)
    println(stack1)
}


