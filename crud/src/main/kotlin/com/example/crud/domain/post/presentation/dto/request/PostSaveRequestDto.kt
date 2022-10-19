package com.example.crud.domain.post.presentation.dto.request

import com.example.crud.domain.post.Post

data class PostSaveRequestDto(
        val title: String,
        val content: String,
        val author: String? = null
) {
    fun toEntity(): Post = Post(
            title = title,
            content = content,
            author = author
    )
}