package com.lzx2005.entity;

/**
 * Created by Lizhengxian on 2017/3/6.
 */

public class Website {

    private long websiteId;
    private String host;
    private String url;
    private String title;
    private String head;
    private String content;

    public long getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(long websiteId) {
        this.websiteId = websiteId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Website{" +
                "websiteId=" + websiteId +
                ", host='" + host + '\'' +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", head='" + head + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
