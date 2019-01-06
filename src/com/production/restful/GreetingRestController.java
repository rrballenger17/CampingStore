package com.production.restful;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.production.annotation.RestEndpoint;

@RestController
public class GreetingRestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	
    	if(name.equals("error")) {
    		throw new NotFoundException();
    	}
    	
    	if(name.isEmpty()) {
    		name = "World";
    	}
    	
    	long count = counter.incrementAndGet();
    	
    	String greetingString = String.format(template, name);
    	
        return new Greeting(count, greetingString);
    }
    


}