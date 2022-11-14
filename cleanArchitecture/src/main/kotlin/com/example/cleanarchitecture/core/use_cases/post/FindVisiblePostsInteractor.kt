package com.example.cleanarchitecture.core.use_cases.post

import com.example.cleanarchitecture.core.entities.CommonPost
import com.example.cleanarchitecture.core.use_cases.post.model.response.PostResponseModel
import com.example.cleanarchitecture.infrastructure.gateways.post.PostGateway
import com.example.cleanarchitecture.infrastructure.gateways.post.model.response.PostGatewayResponseModel
import org.springframework.stereotype.Service

@Service
class FindVisiblePostsInteractor(
    val postGateway: PostGateway
) : FindVisiblePostsInputBoundary {
    override fun execute(): List<PostResponseModel> {
        val postGatewayResponseModels: List<PostGatewayResponseModel> = postGateway.findAll()

        val posts: List<CommonPost> = postGatewayResponseModels
            .map(PostGatewayResponseModel::fromThis)

        val postResponseModels = posts
            .filter { it.canShow() }
            .map(PostResponseModel::of)

        return postResponseModels
    }
}