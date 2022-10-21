package com.example.crud.domain.post.service

import com.example.crud.domain.post.presentation.dto.request.PostSaveRequestDto
import com.example.crud.domain.post.presentation.dto.request.PostUpdateRequestDto
import com.example.crud.domain.post.repository.PostRepository
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class PostServiceTest(
    @Autowired val postService: PostService,
    @Autowired val postRepository: PostRepository
) {

    @Test
    fun `게시물 저장`() {
        // given
        val postReq = PostSaveRequestDto("백패커", "실제로 무협지에 나오는 방식", "백종원")
        //when
        val postId = postService.save(postReq)
        val findPost = postId?.let { postRepository.findById(it).get() }
        //then
        if (findPost != null) {
            Assertions.assertEquals(postId, findPost.id)
        }
    }

    @Test
    @DisplayName("게시물 수정하기")
    fun `게시물 수정하기`() {
        // given
        val id = 1L
        val title = "당근마켓"
        val content = "백엔드 개발자다"
        val updateReq = PostUpdateRequestDto(title, content)
        // when
        postService.update(id, updateReq)
        val post = postRepository.findById(id).get()
        // then
        Assertions.assertEquals(title, post.title)
        Assertions.assertEquals(content, post.content)
        title shouldBe "당근마켓ㅇ"
    }
}