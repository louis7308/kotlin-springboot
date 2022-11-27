package com.example.cleanarchitecture.core.use_cases.post

import com.example.cleanarchitecture.core.entities.CommonPost
import com.example.cleanarchitecture.core.use_cases.post.model.request.CreatePostRequestModel
import com.example.cleanarchitecture.infrastructure.gateways.post.PostGateway
import com.example.cleanarchitecture.infrastructure.gateways.post.model.request.CreatePostGatewayRequestModel
import com.example.cleanarchitecture.infrastructure.gateways.post.model.request.of
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class CreatePostInteractor(
    val postGateway: PostGateway
) : CreatePostInputBoundary {
    override fun create(requestModel: CreatePostRequestModel) {
        val post = CommonPost(
            title = requestModel.title,
            content = requestModel.content,
            createdAt = LocalDateTime.now(),
            view = 0,
            isDeleted = false,
            isPublic = requestModel.isPublic
        )
        val createPostGatewayRequestModel: CreatePostGatewayRequestModel = post.of()
        postGateway.create(createPostGatewayRequestModel)
    }
}