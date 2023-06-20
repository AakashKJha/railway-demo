package com.railway1.railwaydemo1.controller;


import com.railway1.railwaydemo1.model.Blog;
import com.railway1.railwaydemo1.service.BlogService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
@RequiredArgsConstructor
public class BlogController {
    private final BlogService blogService;
    @GetMapping("/")
    public List<Blog> getBlogs() {
        return blogService.getBlogs();
    }
    @PostMapping("/")
    public Blog createBlog(@RequestBody Blog blog) {
        return blogService.createBlog(blog);
    }

}
