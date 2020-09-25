package com.example.book_api.model

import javax.persistence.Id


class Topic {
    @Id
    lateinit var id: String
    lateinit var name: String
    lateinit var description: String

    constructor(id: String, name: String, description: String) {
        this.id = id
        this.name = name
        this.description = description
    }
}