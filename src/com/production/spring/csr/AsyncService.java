
package com.production.spring.csr;


import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
	
	

	
	private int asyncCallsCount = 0;

	
	public int getAsyncCount() {
		return asyncCallsCount;
	}

	
    @Async
	public void incrementAsyncCount() {
		try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) { }

		asyncCallsCount++;
		
		System.out.println("async increment");
	}



}
