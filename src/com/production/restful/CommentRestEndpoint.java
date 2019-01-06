package com.production.restful;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;


import com.production.annotation.RestEndpoint;

@RestEndpoint
public class CommentRestEndpoint {

    @Inject CommentService commentService;

    
    
    
    @RequestMapping(value = "comment", method = RequestMethod.GET)
    @ResponseBody @ResponseStatus(HttpStatus.OK)
    public List<Comment> read()
    {

        return  commentService.getAllComments();
    }
 
    
    
    @RequestMapping(value = "comment/{id}", method = RequestMethod.GET)
    @ResponseBody @ResponseStatus(HttpStatus.OK)
    public Comment read(@PathVariable("id") int id)
    {
        Comment comment = this.commentService.getComment(id);
        
        if(comment == null)
            throw new NotFoundException();
        
        return comment;
    }
	
}
