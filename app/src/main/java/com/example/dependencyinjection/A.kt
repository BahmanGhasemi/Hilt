package com.example.dependencyinjection

import javax.inject.Inject

class A @Inject constructor(private val b: B) {
    fun doSome() {
        b.log()
        println("doSome fired!")
    }
}