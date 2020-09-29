package com.example.book_api.repository

import com.example.book_api.model.Topic
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TopicRepository : CrudRepository<Topic, String>