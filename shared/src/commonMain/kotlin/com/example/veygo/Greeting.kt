package com.example.veygo

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}