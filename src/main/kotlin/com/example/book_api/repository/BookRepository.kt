package com.example.book_api.repository

import com.example.book_api.model.Book
import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<Book, String> {

    fun findByTopicId(topicId: String): List<Book>

}