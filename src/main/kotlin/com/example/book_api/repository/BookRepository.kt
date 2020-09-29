package com.example.book_api.repository

import com.example.book_api.model.Book
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : CrudRepository<Book, String> {

    fun findByTopicId(topicId: String): List<Book>

}