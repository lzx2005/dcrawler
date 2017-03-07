package com.lzx2005.service.impl;

import com.lzx2005.service.CrawlerService;
import org.springframework.stereotype.Component;

/**
 * Created by Lizhengxian on 2017/3/6.
 */

@Component
public class CrawlerServiceImpl implements CrawlerService {
    @Override
    public boolean readUrl(String url) {
        return false;
    }
}
