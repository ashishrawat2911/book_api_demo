package com.example.book_api.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Book(@Id var id: String, var name: String, var description: String, topicId: String) {
    @ManyToOne
    var topic: Topic = Topic(topicId, "", "")
}