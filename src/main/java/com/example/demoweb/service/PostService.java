package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        var post1 = new Post("post 1");
        var post2 = new Post("post 2");
        var post3 = new Post("post 3");
        return Arrays.asList(post1, post2, post3);
    }
}
