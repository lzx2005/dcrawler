package com.lzx2005;

import com.lzx2005.entity.Website;
import com.lzx2005.redis.RedisDao;
import com.lzx2005.repository.MapRepository;
import com.lzx2005.repository.WebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.HashMap;

/**
 * Created by Lizhengxian on 2017/3/6.
 */

@SpringBootApplication
@ComponentScan("com.lzx2005")
public class Application implements CommandLineRunner {

    @Autowired
    RedisDao redisDao;

    @Autowired
    WebsiteRepository repository;

    @Autowired
    MapRepository mapRepository;

    @Override
    public void run(String... args) throws Exception {
        //启动后运行测试
        /*redisDao.put("test1","123");
        System.out.println(redisDao.get("test1"));




        this.repository.deleteAll();

        Website website = new Website();
        website.setHost("www.baidu.com");
        website.setUrl("http://www.baidu.com/a");
        website.setWebsiteId(10000L);

        // save a couple of customers
        this.repository.save(website);

        // fetch all customers
        System.out.println("Website found with findAll():");
        System.out.println("-------------------------------");
        for (Website website1 : this.repository.findAll()) {
            System.out.println(website1);
        }
        System.out.println();


        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("test1","tesr2");
        stringStringHashMap.put("aaa","12312");
        mapRepository.save(stringStringHashMap);*/

    }

    public static void main(String[] args) throws Exception {
        // Close the context so it doesn't stay awake listening for redis
        SpringApplication.run(Application.class, args);

        while (true){
            Thread.sleep(5000);
        }
    }

}