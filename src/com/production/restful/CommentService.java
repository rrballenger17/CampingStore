package com.production.restful;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

public interface CommentService
{
    public List<Comment> getAllComments();
    public Comment getComment(int id);
    public void saveComment(Comment comment);
    
}