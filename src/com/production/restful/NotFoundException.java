package com.production.restful;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class NotFoundException extends RuntimeException
{
	
	public NotFoundException() {
		super("Experimental custom exception");
	}

}