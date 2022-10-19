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

    // 게시글 수정
    @Transactional
    fun update(id: Long, requestDto: PostUpdateRequestDto) : Long? {
        val post = postRepository.findByIdOrNull(id) ?: throw IllegalArgumentException("id = $id, 해당하는 게시글이 없습니다.")

        post.title = requestDto.title
        post.content = requestDto.content

        return id
    }

    @Transactional
    fun findPostById(id: Long): PostResponseDto {
        val post = postRepository.findByIdOrNull(id) ?: throw IllegalArgumentException("id = $id, 해당하는 게시글이 없습니다.")
        return PostResponseDto(post);
    }
}