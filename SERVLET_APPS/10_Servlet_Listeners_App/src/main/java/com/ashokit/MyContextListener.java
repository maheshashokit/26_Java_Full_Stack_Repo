package com.ashokit;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class MyContextListener implements ServletContextListener {
	
	private long contextStartedTime= 0l;
    private long contextEndedTime =0l;
	
    public MyContextListener() {
      System.out.println("MyContextListener Default constructor!!!!");      
    }
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
    	System.out.println("Inside the contextIntialized!!!!!!");
    	contextStartedTime = System.currentTimeMillis();
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    	System.out.println("Inside the contextDestroyed!!!!!");
    	contextEndedTime = System.currentTimeMillis();
    	//calculating total minutes available in server
    	long timedifferences = contextEndedTime - contextStartedTime;
    	System.out.println("Application Available in Server of Milli Seconds::::" +(timedifferences));
    }
	
}
