package com.example.cleanarchitecture.core.use_cases.post.model.response

import com.example.cleanarchitecture.core.entities.CommonPost
import com.example.cleanarchitecture.core.entities.Post
import java.time.LocalDateTime

data class PostResponseModel(
    val title: String,
    val content: String,
    val createdAt: LocalDateTime,
    val view: Int,
    val isDeleted: Boolean,
    val isPublic: Boolean
) {
    companion object {
        fun of(post: CommonPost): PostResponseModel {
            return PostResponseModel(
                title = post.title,
                content = post.content,
                createdAt = post.createdAt,
                view = post.view,
                isDeleted = post.isDeleted,
                isPublic = post.isPublic
            )
        }
    }
}
