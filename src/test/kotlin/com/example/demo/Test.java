package com.example.demo;

import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.ConsolePageModelPipeline;
import us.codecraft.webmagic.model.OOSpider;

public class Test {

    public static void main(String[] args) {

        OOSpider.create(Site.me().setSleepTime(1000)
                , new ConsolePageModelPipeline(), Book.class)
                .addUrl("https://www.douban.com").run();
    }
}
