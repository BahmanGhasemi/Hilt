package com.example.dependencyinjection

import javax.inject.Inject

class Car @Inject constructor() : Vehicle {
    override fun drive() {
        println("car is driving")
    }
}