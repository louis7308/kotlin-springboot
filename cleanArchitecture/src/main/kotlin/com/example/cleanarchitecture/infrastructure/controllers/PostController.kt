package com.example.cleanarchitecture.infrastructure.controllers

import com.example.cleanarchitecture.core.use_cases.post.CreatePostInputBoundary
import com.example.cleanarchitecture.core.use_cases.post.FindVisiblePostsInputBoundary
import com.example.cleanarchitecture.core.use_cases.post.model.request.CreatePostRequestModel
import com.example.cleanarchitecture.core.use_cases.post.model.response.PostResponseModel
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("posts")
class PostController(
    val createPostInputBoundary: CreatePostInputBoundary,
    val findVisiblePostsInputBoundary: FindVisiblePostsInputBoundary
) {
    @GetMapping
    fun findAll() : ResponseEntity<List<PostResponseModel>> {
        val posts: List<PostResponseModel> = findVisiblePostsInputBoundary.execute()

        return ResponseEntity.ok().body(posts)
    }


    @PostMapping
    fun create(@RequestBody createPostRequestModel: CreatePostRequestModel) : ResponseEntity<Void> {
        createPostInputBoundary.create(createPostRequestModel)
        return ResponseEntity.ok().build()
    }
}