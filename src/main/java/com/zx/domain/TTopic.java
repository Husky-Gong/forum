package com.zx.domain;

import java.util.Date;

public class TTopic {
    private Integer topicid;

    private String title;

    private String content;

    private String author;

    private Date createdate;

    private Integer clickamount;

    public Integer getTopicid() {
        return topicid;
    }

    public void setTopicid(Integer topicid) {
        this.topicid = topicid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getClickamount() {
        return clickamount;
    }

    public void setClickamount(Integer clickamount) {
        this.clickamount = clickamount;
    }
}