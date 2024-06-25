package com.example.dependencyinjection

class Retrofit private constructor(builder: Builder) : NetworkService {
    private val url: String?
    private val protocol: String?
    private val converter: String?

    init {
        this.url = builder.url
        this.protocol = builder.protocol
        this.converter = builder.converter
    }

    override fun log(message: String) {
        println("retrofit log: $message")
    }

    class Builder {
        var url: String? = null
            private set

        var protocol: String? = null
            private set

        var converter: String? = null
            private set

        fun url(url: String) = apply { this.url = url }
        fun protocol(protocol: String) = apply { this.protocol = protocol }
        fun converter(converter: String) = apply { this.converter = converter }
        fun build() = Retrofit(this)
    }
}