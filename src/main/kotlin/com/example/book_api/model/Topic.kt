package com.example.book_api.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Topic(@Id var id: String, var name: String, var description: String)