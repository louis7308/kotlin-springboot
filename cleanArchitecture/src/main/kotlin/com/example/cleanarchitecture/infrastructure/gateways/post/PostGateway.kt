package com.example.cleanarchitecture.infrastructure.gateways.post

import com.example.cleanarchitecture.infrastructure.gateways.post.model.request.CreatePostGatewayRequestModel
import com.example.cleanarchitecture.infrastructure.gateways.post.model.response.PostGatewayResponseModel

interface PostGateway {
    fun create(createPostGatewayRequestModel: CreatePostGatewayRequestModel)
    fun findAll(): List<PostGatewayResponseModel>
}