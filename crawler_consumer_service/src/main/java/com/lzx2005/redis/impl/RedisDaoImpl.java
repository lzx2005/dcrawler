package com.lzx2005.redis.impl;

import com.lzx2005.redis.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**
 * Created by Lizhengxian on 2017/3/6.
 */
@Component
public class RedisDaoImpl implements RedisDao {



    @Autowired
    private StringRedisTemplate template;
    @Override
    public void put(String key, String value) {
        ValueOperations<String, String> ops = this.template.opsForValue();
        ops.set(key, value);
    }

    @Override
    public String get(String key) {
        ValueOperations<String, String> ops = this.template.opsForValue();
        return ops.get(key);
    }
}
