package com.codeup.checkpoint.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return  "This is the posts page!";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String getPost(@PathVariable long id) {
        return  "This is the post page for id "+ id + "!";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String getCreatePostForm(){
            return "This is where you'll create a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "Post successfully created! (in the future)";
    }

}
