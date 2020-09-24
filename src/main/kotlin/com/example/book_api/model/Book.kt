package com.example.book_api.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Book {
    @Id
    lateinit var id: String;
    lateinit var name: String;
    lateinit var description: String;

    constructor(id: String, name: String, description: String) {
        this.id = id
        this.name = name
        this.description = description
    }
}