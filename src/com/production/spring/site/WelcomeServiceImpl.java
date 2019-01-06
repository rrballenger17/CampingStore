package com.production.spring.site;

import org.springframework.stereotype.Service;
import com.production.spring.site.WelcomeService;

@Service
public class WelcomeServiceImpl implements WelcomeService
{
    @Override
    public String getMessage(String name)
    {
        return "Hello, " + name + "!";
    }
}
