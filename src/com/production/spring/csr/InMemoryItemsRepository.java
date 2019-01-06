package com.production.spring.csr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryItemsRepository implements ItemsRepository  {

	
	private List<Item> list = new ArrayList<Item>();
	
	public InMemoryItemsRepository() {
					

			Item item = new Item();
						
			item.setName("The 33 Bears stories you need to read as the playoffs begin");
			
			item.setDescription("From the first day of 2018 through the last, we mined our coverage to select 33 stories you'll want to dig in on or re-read to get fully prepared for ...");
		
			list.add(item);
			
			
			
			item = new Item();
			
			item.setName("Massachusetts Gov. Baker to be sworn into 2nd four-year term");
			
			item.setDescription("BOSTON (AP) — Massachusetts Gov. Charlie Baker is about to be sworn in to a second term in office. The Republican handily defeated his ...");
		
			list.add(item);
			
			
			
			item = new Item();
			
			item.setName("Massachusetts biking safety and connectivity major focuses of state plan");
			
			item.setDescription("The Massachusetts Department of Transportation is seeking feedback through January on a plan it released in late December to better connect ...");
		
			list.add(item);
			
			
			
			item = new Item();
			
			item.setName("To combat climate change, Massachusetts needs to break these ...");
			
			item.setDescription("In Quebec, clean power that Massachusetts could be using goes to waste, whooshing over dams while environmentalists battle against plans ...");
		
			list.add(item);
		
		
		
	}
	
	@Override
	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		
		// improvement TO-DO: return copy of array 
		return list;
	}

}
