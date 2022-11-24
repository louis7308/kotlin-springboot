package com.example.cleanarchitecture.core.use_cases.post

import com.example.cleanarchitecture.core.use_cases.post.model.request.CreatePostRequestModel

interface CreatePostInputBoundary {
    fun create(requestModel: CreatePostRequestModel)
}