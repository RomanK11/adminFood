package com.wf.admin.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;

import com.wf.admin.models.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {
    
}
