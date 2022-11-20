package com.example.cleanarchitecture.core.use_cases.post.model.request

data class CreatePostRequestModel(
    val title: String,
    val content: String,
    val isPublic: Boolean
)