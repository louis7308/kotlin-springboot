package com.example.crud.domain.post.service

import com.example.crud.domain.post.presentation.dto.request.PostSaveRequestDto
import com.example.crud.domain.post.presentation.dto.request.PostUpdateRequestDto
import com.example.crud.domain.post.presentation.dto.response.PostResponseDto
import com.example.crud.domain.post.repository.PostRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class PostService(
        private val postRepository: PostRepository
) {
    // 게시글 저장
    @Transactional
    fun save(requestDto : PostSaveRequestDto): Long? = postRepository.save(requestDto.toEntity()).id
}