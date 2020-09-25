package com.example.book_api.service

import com.example.book_api.model.Book
import com.example.book_api.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookService {
    @Autowired
    lateinit var bookRepository: BookRepository
    fun getAllBooks(topicsId: String): List<Book> {
        return bookRepository.findByTopicId(topicsId);
    }

    fun getBook(bookId: String): Book {
        return bookRepository.findById(bookId).get()
    }

    fun addBook(topicsId: String, book: Book): Book {
        bookRepository.save(book)
        return book
    }

    fun updateBook(book: Book): Book? {
        bookRepository.save(book)
        return book
    }

    fun deleteBook(id: String): String {
        bookRepository.deleteById(id)
        return "Book Not found"
    }
}