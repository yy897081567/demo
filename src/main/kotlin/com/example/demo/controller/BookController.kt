package com.example.demo.controller

import com.example.demo.entity.Book
import com.example.demo.repository.BookRepository
import com.example.demo.service.BookPipeline
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
@Api("获取豆瓣书籍信息的Controller", tags = ["书籍控制器"], description = "处理http请求,获取爬取到的豆瓣书籍信息的控制器")
class BookController {

    @Autowired
    private lateinit var bookRepository: BookRepository

    @GetMapping("/books/latest")
    @ApiOperation(value = "获取豆瓣最新书籍信息", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    fun getBooks(): List<Book> {
        bookRepository.deleteAll()
        bookRepository.saveAll(BookPipeline.books)
        return BookPipeline.books
    }





}