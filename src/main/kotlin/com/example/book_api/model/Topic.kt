package com.example.book_api.model

import javax.persistence.Id


data class Topic(@Id var id: String, var name: String, var description: String)