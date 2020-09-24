package com.example.book_api

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TopicController {
    @RequestMapping("/topics")
    fun getAllTopics(): List<Topic> {
        val topics = ArrayList<Topic>();
        for (x in 1..10) {
            topics.add(Topic("$x", "Book $x", "Book $x Desc"))
        }
        return topics;
    }
}