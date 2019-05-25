package com.example.demo.entity

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@ApiModel("书籍实体类")
data class Book(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
                @ApiModelProperty(value = "书籍ID")
                var id: Int? = null,
                @ApiModelProperty(value = "书名")
                var bookName: String? = null,
                @ApiModelProperty(value = "书籍评分")
                var rating: String? = null,
                @ApiModelProperty(value = "书籍出版信息")
                var info: String? = null,
                @ApiModelProperty(value = "书籍简介")
                var note: String? = null)