package com.example.cleanarchitecture.core.entities

interface Post {
    fun canShow(): Boolean

    fun delete()

    fun increaseView()
}