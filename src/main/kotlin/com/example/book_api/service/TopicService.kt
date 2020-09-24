package com.example.book_api.service

import com.example.book_api.model.Topic
import com.example.book_api.repository.TopicRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TopicService {
    @Autowired
    lateinit var topicRepository: TopicRepository
    fun getAllTopics(): List<Topic> {
        val topics = ArrayList<Topic>()
        topicRepository.findAll().forEach {
            topics.add(it)
        }
        return topics
    }

    fun getTopic(id: String): Topic {
        return topicRepository.findById(id).get()
    }

    fun addTopic(topic: Topic): Topic {
        topicRepository.save(topic)
        return topic;
    }

    fun updateTopic(topic: Topic): Topic? {
        topicRepository.save(topic)
        return topic
    }

    fun deleteTopic(id: String): String {
        topicRepository.deleteById(id)
        return "Book Not found";
    }
}