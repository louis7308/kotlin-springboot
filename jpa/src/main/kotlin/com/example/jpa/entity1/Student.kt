package com.example.jpa.entity1

import javax.persistence.*

@Entity
class Student(
   name: String,
   teacher: Teacher
) {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="id", nullable = false)
   var id: Long = 0

   @Column(name = "name", nullable = false, length = 100)
   var name: String = name

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "teacher_id")
   var teacher: Teacher = teacher

}