package com.example.jpa

import com.example.jpa.entity1.Student
import com.example.jpa.entity1.Teacher
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JpaApplication

fun main(args: Array<String>) {
    runApplication<JpaApplication>(*args)
}
