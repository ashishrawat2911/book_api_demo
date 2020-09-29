package com.example.book_api.repository

import com.example.book_api.model.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<Book, String> {

    fun findByTopicId(topicId: String): List<Book>

}