package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List<Post> posts;
    PostService()
    {
        var post1 = new Post("Чем отличается курящий газовщик от моджахеда?\n" +
                "моджахед знает, когда взорвётся", new Date());
        var post2 = new Post("Как называется курица с ментальным расстройством?\n" +
                "куропатка", new Date());
        var post3 = new Post("Звонит девушка в службу спасения и говорит:\n" +
                "- Медведь на дереве застрял.\n" +
                "Приходит мужик с маленькой собачкой и говорит:\n" +
                "- Познакомьтесь это Кефирчик. Вот вам ружье, я сейчас залезу на дерево и скину медведя, а собака его за яйца и в зоопарк.\n" +
                "Девушка:\n" +
                " - А ружьё то мне зачем?\n" +
                " - А это если я с дерева упаду - стреляйте в Кефирчика", new Date());
        posts = new ArrayList<>();
        posts.addAll(Arrays.asList(post1, post2, post3));
    }
    public List<Post> listAllPosts(){
        return posts;
    }
    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
