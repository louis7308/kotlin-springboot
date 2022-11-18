package com.example.cleanarchitecture.infrastructure.repositories

import com.example.cleanarchitecture.infrastructure.table.PostTable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface JPAPostRepository : JpaRepository<PostTable, Long>{
}

