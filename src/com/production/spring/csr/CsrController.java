package com.production.spring.csr;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import com.production.annotation.WebController;

import java.time.Instant;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

@WebController
public class CsrController {

    @Inject ItemsService itemsService;

    @Inject ScheduledService scheduledService;
    
    @Inject AsyncService asyncService;
	
    @RequestMapping(value = "fourteen", method = RequestMethod.GET)
    public String listDiscussions(Map<String, Object> model)
    {
        model.put("items", this.itemsService.getItems());
        		
        		
        return "itemsView";
    }

    @RequestMapping(value = "fourteenAsync", method = RequestMethod.GET)
    public String fourteenAsync(Map<String, Object> model)
    {        		

    	
    	model.put("asyncCalls", asyncService.getAsyncCount() );
    	
    	System.out.println("async " + asyncService.getAsyncCount());
    	
    	model.put("calls", scheduledService.getScheduledCount());
    	
    	System.out.println("scheduled " + scheduledService.getScheduledCount());

    	    	
        return "AsyncView";
    }

    @RequestMapping(value = "fourteenAsync", method = RequestMethod.POST)
    public String fourteenAsyncPost(Map<String, Object> model)
    {        		
    	
    	System.out.println("should increment async count");
    	
    	asyncService.incrementAsyncCount();

    	return fourteenAsync(model);
    }
}





