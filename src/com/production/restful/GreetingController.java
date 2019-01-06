package com.production.restful;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import com.production.annotation.RestEndpoint;
import com.production.annotation.WebController;

import java.time.Instant;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

@WebController
public class GreetingController {

	
    @RequestMapping(value = "seventeen", method = RequestMethod.GET)
    public String seventeenRestExampleView(Map<String, Object> model)
    {        		
        		
        return "seventeenView";
    }

}


