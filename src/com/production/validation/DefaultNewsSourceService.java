package com.production.validation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DefaultNewsSourceService implements NewsSourceService{

	private List<NewsSource> list = new ArrayList<NewsSource>();
	
	@Override
	public void saveNewsSource(NewsSource source) {
		// TODO Auto-generated method stub
		
		list.add(source);
		
	}

	@Override
	public List<NewsSource> getAllNewsSources() {
		// TODO Auto-generated method stub
		return list;
	}
	
	
	

}
