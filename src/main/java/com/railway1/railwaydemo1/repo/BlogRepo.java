package com.railway1.railwaydemo1.repo;

import com.railway1.railwaydemo1.model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogRepo extends MongoRepository<Blog, String> {
}
