package com.example.cleanarchitecture.core.use_cases.post

import com.example.cleanarchitecture.core.use_cases.post.model.response.PostResponseModel

interface FindVisiblePostsInputBoundary {
    fun execute() : List<PostResponseModel>
}