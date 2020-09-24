package com.example.book_api.controller

import com.example.book_api.model.Topic
import com.example.book_api.service.TopicService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class TopicController {
    @Autowired
    lateinit var topicService: TopicService;

    @RequestMapping("/topics")
    fun getAllTopics(): List<Topic> {
        return topicService.getAllTopics();
    }

    @Throws(Exception::class)
    @RequestMapping("/topics/{id}")
    fun getTopic(@PathVariable("id") id: String): Topic {
        return topicService.getTopic(id);
    }

    @RequestMapping(value = ["/topics"], method = [RequestMethod.POST])
    fun addTopics(@RequestBody topic: Topic): Topic {
        return topicService.addTopic(topic)
    }

    @RequestMapping(value = ["/topics"], method = [RequestMethod.PUT])
    fun updateTopic(@RequestBody topic: Topic): Topic? {
        return topicService.updateTopic(topic);
    }

    @RequestMapping(value = ["/topics/{id}"], method = [RequestMethod.DELETE])
    fun deleteTopic(@PathVariable("id") id: String): String {
        return topicService.deleteTopic(id);
    }
}