package com.example.book_api.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Book {
    @Id
    var id: String
    var name: String
    var description: String

    @ManyToOne
    var topic: Topic

    constructor(id: String, name: String, description: String, topicId: String) {
        this.id = id
        this.name = name
        this.description = description
        this.topic = Topic(topicId, "", "")
    }


}