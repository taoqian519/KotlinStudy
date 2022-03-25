package com.qiantao.kotlinstudy.introduction


class Variables {

    fun main() {
        var a: String = "initial"
        println(a)
        val b: Int = 1
        val c = 3

        val d: Int
        if (c > b) {
            d = 1
        } else {
            d = 2
        }

        var neverNUll: String = "This not be null"
   //     neverNUll = null 编译失败

        var nullable: String? = "You can keep a null here"
        nullable = null

        var inferredNonNUll = "The compiler assumes non-null"
   //     inferredNonNUll = null

        fun strLength(notNull: String): Int {
            return notNull.length
        }

        strLength(neverNUll)
       // strLength(nullable)
    }

    fun describeString(maybeString:String?):String {
        if (maybeString != null && maybeString.length > 0) {
            return "String of length ${maybeString.length}"
        } else{
            return "Empty or null string"
        }
    }
}