package com.example.book_api.controller

import com.example.book_api.model.Book
import com.example.book_api.service.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/topics")
class BooksController {
    @Autowired
    lateinit var bookService: BookService;

    @RequestMapping("/{topicsId}/books")
    fun getAllBooks(@PathVariable("topicsId") topicsId: String): List<Book> {
        return bookService.getAllBooks(topicsId);
    }

    @Throws(Exception::class)
    @RequestMapping("/{topicsId}/books/{booksId}")
    fun getBook(@PathVariable("topicsId") topicsId: String, @PathVariable("booksId") booksId: String): Book {
        return bookService.getBook(booksId);
    }

    @RequestMapping(value = ["/{topicsId}/books"], method = [RequestMethod.POST])
    fun addBook(@RequestBody book: Book, @PathVariable("topicsId") topicsId: String): Book {
        return bookService.addBook(book)
    }

    @RequestMapping(value = ["/{topicsId}/books"], method = [RequestMethod.PUT])
    fun updateBook(@RequestBody book: Book, @PathVariable("topicsId") topicsId: String): Book? {
        return bookService.updateBook(book);
    }

    @RequestMapping(value = ["/{topicsId}/books/{booksId}"], method = [RequestMethod.DELETE])
    fun deleteBook(@PathVariable("booksId") booksId: String, @PathVariable("topicsId") topicsId: String): String {
        return bookService.deleteBook(booksId);
    }
}