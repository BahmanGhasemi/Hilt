package com.example.dependencyinjection

import javax.inject.Inject

class B @Inject constructor()  {
    init {
        println("B in created!")
    }

    fun log(){
        println("log is fired!")
    }
}