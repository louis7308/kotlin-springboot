package com.example.cleanarchitecture.infrastructure.gateways.post.model.request

import com.example.cleanarchitecture.core.entities.CommonPost
import java.time.LocalDateTime

data class CreatePostGatewayRequestModel(
    val title: String,
    val content: String,
    val createdAt: LocalDateTime,
    val view: Int,
    val isDeleted: Boolean,
    val isPublic: Boolean
) {

}

fun CommonPost.of() = CreatePostGatewayRequestModel(
    title = title,
    content = content,
    createdAt = createdAt,
    view = view,
    isDeleted = isDeleted,
    isPublic = isPublic
)