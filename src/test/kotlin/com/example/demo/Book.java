package com.example.demo;

import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.HelpUrl;
import us.codecraft.webmagic.model.annotation.TargetUrl;

@TargetUrl("https://book.douban.com/latest?icn=index-latestbook-all")
@HelpUrl("https://www.douban.com/")
public class Book {

    @ExtractBy(value = "div.detail-frame h2 a[href='https://book.douban.com/subject/33423373/']", type = ExtractBy.Type.Css, notNull = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
