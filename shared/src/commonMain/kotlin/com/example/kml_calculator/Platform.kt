package com.example.kml_calculator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform