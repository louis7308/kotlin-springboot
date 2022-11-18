package com.example.cleanarchitecture.infrastructure.gateways.post.model.response

import com.example.cleanarchitecture.core.entities.CommonPost
import java.time.LocalDateTime

data class PostGatewayResponseModel(
    val title: String,
    val content: String,
    val createdAt: LocalDateTime,
    val view: Int,
    val isDeleted: Boolean,
    val isPublic: Boolean
) {
    fun fromThis() : CommonPost {
        return CommonPost(
            title = title,
            content = content,
            createdAt = createdAt,
            view = view,
            isDeleted = isDeleted,
            isPublic = isPublic
        )
    }
}