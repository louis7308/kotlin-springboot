package com.example.jpa

import com.example.jpa.entity1.Student
import com.example.jpa.entity1.Teacher
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class JpaApplicationTests: DescribeSpec({
    describe("entity") {
        context("Student 클래스가 있으면") {
            it("해당 식에 대한 결과값이 반환") {
                var teacher = Teacher("seung")
                var student = Student("hi", teacher)

                student.name shouldBe "hello"
            }
        }
    }


})
