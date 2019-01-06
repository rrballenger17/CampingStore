package com.production.validation;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import com.production.annotation.WebController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

@WebController
public class ValidationController {
	
	@Inject NewsSourceService nss;
	
	private void springValidateNewsSource(@Valid NewsSource ns) {
		try {
			

			if(ns.getDate().equals( new SimpleDateFormat("yyyy").parse("1881"))) {
				System.out.println("1881");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
    @RequestMapping(value = "sixteen", method = RequestMethod.GET)
    public String getNewsSourceForm()
    {                		
        		
        return "newsSourceForm";
    }

    @RequestMapping(value = "sixteen", method = RequestMethod.POST)
    @ResponseBody
    public String listDiscussions(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("date") String date)
    {
        NewsSource cs = new NewsSource();
        
        cs.setId(id);
        
        cs.setName(name);
        
        cs.setDate(date);
        
        springValidateNewsSource(cs);
        
        try {
        	nss.saveNewsSource(cs);
            
        }catch(ConstraintViolationException e)
        {
        	return "There was an error with the new news source: " 
        			+ e.getConstraintViolations().iterator().next().getMessage();
        }
        		
        return "The news source \"" + name + "\" was successfully saved.";
    }
    
}






