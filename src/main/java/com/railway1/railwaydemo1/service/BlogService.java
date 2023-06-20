package com.railway1.railwaydemo1.service;

import com.railway1.railwaydemo1.model.Blog;
import com.railway1.railwaydemo1.repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    BlogRepo blogRepository;
    public List<Blog> getBlogs() {
        return blogRepository.findAll();
    }
    public Blog createBlog(Blog blog) {
        Blog blog1 = new Blog();
        blog1.setAuthor(blog.getAuthor());
        blog1.setCategory(blog.getCategory());
        blog1.setTags(blog.getTags());
        blog1.setTitle(blog.getTitle());
        blog1.setContent(blog.getContent());
        blog1.setDate(blog.getDate());
        blog1.setStatus(blog.getStatus());
        blog1.setCommentStatus(blog.getCommentStatus());
        blog1.setAllowComment(blog.getAllowComment());
        blog1.setAllowPing(blog.getAllowPing());
        blog1.setAllowFeed(blog.getAllowFeed());
        blog1.setUrl(blog.getUrl());
        blog1.setType(blog.getType());
        blog1.setPassword(blog.getPassword());
        blog1.setTemplate(blog.getTemplate());
        blog1.setContentMd(blog.getContentMd());
        blog1.setContentHtml(blog.getContentHtml());
        blog1.setCommentCount(blog.getCommentCount());
        blog1.setPingCount(blog.getPingCount());
        blog1.setUpdateTime(blog.getUpdateTime());
        blog1.setCreateDate(blog.getCreateDate());
        blog1.setLastmodify(blog.getLastmodify());
        blog1.setDescription(blog.getDescription());
        blog1.setThumbnail(blog.getThumbnail());
        blog1.setParent(blog.getParent());
        blog1.setOrder(blog.getOrder());
        blog1.setTop(blog.getTop());
        blog1.setHide(blog.getHide());
        blog1.setDeleted(blog.getDeleted());
        blog1.setDomain(blog.getDomain());
        blog1.setAllowDownload(blog.getAllowDownload());
        blog1.setCode(blog.getCode());
        blog1.setTypeId(blog.getTypeId());
        blog1.setUserId(blog.getUserId());
        blog1.setPostCount(blog.getPostCount());
        blog1.setCommentCountStr(blog.getCommentCountStr());
        blog1.setPingCountStr(blog.getPingCountStr());
        blog1.setPostDate(blog.getPostDate());
        return blogRepository.save(blog1);
    }
}
