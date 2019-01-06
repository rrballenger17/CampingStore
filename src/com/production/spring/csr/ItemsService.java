package com.production.spring.csr;

import java.util.ArrayList;
import java.util.List;

public interface ItemsService {
	
	
	
	List<Item> list = new ArrayList<Item>();
	
	public List<Item> getItems();
	
}
