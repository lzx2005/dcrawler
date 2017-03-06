package com.lzx2005.redis;

/**
 * Created by Lizhengxian on 2017/3/6.
 */
public interface RedisDao {

    void put(String key,String value);

    String get(String key);
}
