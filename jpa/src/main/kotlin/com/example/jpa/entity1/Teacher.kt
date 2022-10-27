package com.example.jpa.entity1

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class Teacher(
    name: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long = 0
        private set

    var name: String = name

    @OneToMany(mappedBy = "teacher")
    var students: MutableList<Student> = mutableListOf()
}