package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;

    private Long id;

    public Long getId() {
        return id;
    }

    private Date creationDate;

    public Date getCreationDate() {
        return creationDate;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getText() {
        return text;
    }
    public Post(Long id, String text, Date date)
    {
        this.text = text;
        this.likes = 0;
        this.creationDate = date;
        this.id = id;
    }
}
