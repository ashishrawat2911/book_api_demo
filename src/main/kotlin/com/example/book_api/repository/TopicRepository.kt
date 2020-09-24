package com.example.book_api.repository

import com.example.book_api.model.Topic
import org.springframework.data.repository.CrudRepository

interface TopicRepository : CrudRepository<Topic, String> {


}