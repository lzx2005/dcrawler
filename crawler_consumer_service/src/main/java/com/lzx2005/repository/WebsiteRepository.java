package com.lzx2005.repository;

import com.lzx2005.entity.Website;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Lizhengxian on 2017/3/6.
 */
@Repository
public interface WebsiteRepository extends MongoRepository<Website,Long> {

    List<Website> findByHost(String host);

}
