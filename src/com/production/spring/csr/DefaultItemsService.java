package com.production.spring.csr;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class DefaultItemsService implements ItemsService {
	
	

	@Inject ItemsRepository repo;
	
	public DefaultItemsService() {		
	}
	
	@Override
	public List<Item> getItems(){
		return repo.getAllItems();
	
	}


}
