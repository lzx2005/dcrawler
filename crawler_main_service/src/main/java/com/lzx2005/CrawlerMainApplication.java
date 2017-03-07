package com.lzx2005;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Lizhengxian on 2017/3/6.
 */
@SpringBootApplication(scanBasePackages = "com.lzx2005.service")
public class CrawlerMainApplication {

    public static void main(String[] args) {
        System.setProperty("spring.main.web-environment","false");
        ConfigurableApplicationContext context = SpringApplication.run(CrawlerMainApplication.class, args);
    }
}
