package com.back.boundedContext.repository;

import com.back.boundedContext.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
