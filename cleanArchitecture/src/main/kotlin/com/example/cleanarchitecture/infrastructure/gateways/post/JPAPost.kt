package com.example.cleanarchitecture.infrastructure.gateways.post

import com.example.cleanarchitecture.infrastructure.gateways.post.model.request.CreatePostGatewayRequestModel
import com.example.cleanarchitecture.infrastructure.gateways.post.model.response.PostGatewayResponseModel
import com.example.cleanarchitecture.infrastructure.repositories.JPAPostRepository
import com.example.cleanarchitecture.infrastructure.table.PostTable
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class JPAPost(
    val jpaPostRepository: JPAPostRepository
) : PostGateway {
    override fun create(createPostGatewayRequestModel: CreatePostGatewayRequestModel) {
        jpaPostRepository.save(PostTable(
            title = createPostGatewayRequestModel.title,
            content = createPostGatewayRequestModel.content,
            createdAt = createPostGatewayRequestModel.createdAt,
            view = createPostGatewayRequestModel.view,
            isDeleted = createPostGatewayRequestModel.isDeleted,
            isPublic = createPostGatewayRequestModel.isPublic
        ))
    }

    override fun findAll(): List<PostGatewayResponseModel> {
        return jpaPostRepository.findAll()
            .stream()
            .map {postTable -> PostGatewayResponseModel(
                title = postTable.title,
                content = postTable.content,
                createdAt = postTable.createdAt,
                view = postTable.view,
                isDeleted = postTable.isDeleted,
                isPublic = postTable.isPublic
            )}
            .collect(Collectors.toList())
    }
}