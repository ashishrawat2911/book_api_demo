package com.example.book_api.service

import com.example.book_api.model.Topic
import org.springframework.stereotype.Service

@Service
class TopicService {
    var topics = ArrayList<Topic>();

    fun getAllTopics(): List<Topic> {

        return topics.toList();
    }

    fun getTopic(id: String): Topic {
        return topics.first { id == it.id }
    }

    fun addTopic(topic: Topic): Topic {
        topics.add(topic)
        return topic;
    }
}