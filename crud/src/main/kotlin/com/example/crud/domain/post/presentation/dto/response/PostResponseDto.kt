package com.example.crud.domain.post.presentation.dto.response

import com.example.crud.domain.post.Post

data class PostResponseDto(
        val id: Long,
        val title: String,
        val content: String,
        val author: String? = null
) {
    constructor(post: Post) : this(
            id = post.id!!, // Null이 절대 오면 안될때
            title = post.title,
            content = post.content,
            author = post.author
    )
}
