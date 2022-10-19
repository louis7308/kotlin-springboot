package com.example.crud.domain.post.presentation.dto

import com.example.crud.domain.post.presentation.dto.request.PostSaveRequestDto
import com.example.crud.domain.post.presentation.dto.request.PostUpdateRequestDto
import com.example.crud.domain.post.presentation.dto.response.PostResponseDto
import com.example.crud.domain.post.service.PostService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/post")
class PostApiController(
   private val postService: PostService
) {
    @GetMapping("/{id}")
    fun findPostById(@PathVariable id: Long): PostResponseDto = postService.findPostById(id)

    @PostMapping
    fun save(@RequestBody requestDto: PostSaveRequestDto): Long? = postService.save(requestDto)

    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: Long, @RequestBody requestDto: PostUpdateRequestDto): Long? = postService.update(id, requestDto)
}