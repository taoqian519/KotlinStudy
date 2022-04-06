package com.qiantao.kotlinstudy.collections


//TODO 为什么属性可以直接定义在外面，而不需要定义在类里面
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers

fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSystemUser(4)
    systemUsers.add(5)
    systemUsers.add(1)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach{
        println("Some useful info on user $it")
    }
}
