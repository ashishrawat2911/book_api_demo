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

    fun updateTopic(topic: Topic, id: String): Topic? {
        for (i in 0 until topics.size) {
            if (id == topics[i].id) {
                topics[i] = topic
                return topic;
            }
        }
        return null;
    }

    fun deleteTopic(id: String): String{
        for (i in 0 until topics.size) {
            if (id == topics[i].id) {
                topics.remove(topics[i])
                return "Book deleted"
            }
        }
        return "Book Not found";
    }
}