package com.example.demo.service

import com.example.demo.entity.Book
import com.example.demo.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import us.codecraft.webmagic.ResultItems
import us.codecraft.webmagic.Task
import us.codecraft.webmagic.pipeline.Pipeline

class BookPipeline : Pipeline {

    companion object {
        lateinit var books: List<Book>
    }

    override fun process(resultItems: ResultItems, task: Task) {
        books = resultItems.get<List<Book>>("books")
    }

}
