package com.example.dependencyinjection

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class RetrofitQualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class VolleyQualifier