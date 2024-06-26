package com.example.dependencyinjection

import android.content.Context
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject

class MyClass @Inject constructor(@ActivityContext private val context: Context) {
    init {
        println("the context is: $context")
    }
}