package com.production.spring.site;

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
public class SpringController
{
    private WelcomeService welcomeService;

    @ResponseBody
    @RequestMapping("twelve")
    public String helloWorld(HttpServletRequest request)
    {
        return "Hello, From Spring! This page also accepts the URL parameter 'name'!";
    }

    @ResponseBody
    @RequestMapping(value = "twelve", params = {"name"})
    public String helloName(@RequestParam("name") String name)
    {
        return this.welcomeService.getMessage(name);
    }
    
    
    
    

     
    @ResponseBody
    @RequestMapping(value = "thirteenFormInbound", method=RequestMethod.POST)
    public String inboundFormExample(UserForm form)
    {
    	String output = "username: " + form.getUsername();
    	
    	output += "; ";

    	output += "email: " + form.getEmailAddress();
    	
    	output += "; ";
    	
    	output += "password: " + form.getPassword();
    	
    	return output;
    	
    }
    
    @RequestMapping(value = "thirteenRedirectView")
    public RedirectView redirectViewExample(Map<String, Object> model)
    {
    	return new RedirectView("thirteenRedirectViewTwo", true);
    	
    }
    
    @RequestMapping(value = "thirteenRedirectViewTwo")
    public String redirectViewExampleTwo(Map<String, Object> model)
    {
    	return "redirectView";
    	
    }
    
    
    
    @ResponseBody
    @RequestMapping(value = "thirteen", params = {"special"})
    public String thirteenParameter(@RequestParam("special") String special)
    {
        return "This method is for the URL thirteen and the special parameter";
    }
    
    
    
    
    
    @RequestMapping(value = "thirteen", method = RequestMethod.GET)
    public String dashboard(Map<String, Object> model)
    {
        model.put("text", "This is a model attribute.");
        model.put("date", Instant.now());
 
        return "thirteenIndex";
    }
    
    

    @Inject
    public void setGreetingService(WelcomeService greetingService)
    {
        this.welcomeService = greetingService;
    }
}










