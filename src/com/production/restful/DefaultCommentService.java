package com.production.restful;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DefaultCommentService implements CommentService {

	
	
	private List<Comment> all = new ArrayList<Comment>();
	
	public DefaultCommentService() {
		
		Comment one = new Comment();
		
		one.setAuthor("Ryan");
		one.setComment("This story is interesting!");
		one.setCommentId(18);
		one.setNewsId(3);
		one.setUpVotes(2);
		
		all.add(one);
		
		Comment two = new Comment();
		
		two.setAuthor("Chuck");
		two.setComment("I learned something new.");
		two.setCommentId(12);
		two.setNewsId(2);
		two.setUpVotes(1);
		
		all.add(two);
		
		Comment three = new Comment();
		
		three.setAuthor("Jenn");
		three.setComment("That's awesome. I wish I was there!");
		three.setCommentId(11);
		three.setNewsId(5);
		three.setUpVotes(4);
		
		all.add(three);
	}
	
	@Override
	public List<Comment> getAllComments() {
		// TODO Auto-generated method stub
		return all;
	}

	// TO-DO
	@Override
	public Comment getComment(int id) {
		// TODO Auto-generated method stub
		
		for(Comment c: all) {
			if(c.getCommentId() == id) {
				return c;
			}
		}
		
		return null;
	}

	@Override
	public void saveComment(Comment comment) {
		// TODO Auto-generated method stub
		all.add(comment);
	}


}
