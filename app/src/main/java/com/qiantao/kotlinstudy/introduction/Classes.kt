package com.qiantao.kotlinstudy.introduction


class Classes {
}

class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()
    val contact = Contact(1, "tao.qian@ubtrobot.com")
    println(contact.id)
    contact.email = "tao.qian@test.com"
}

fun methode(id: Int, email: String?) {

}