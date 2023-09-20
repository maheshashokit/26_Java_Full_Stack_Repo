package com.ashokit;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;


public class MyServletContextAttributeListener implements ServletContextAttributeListener {

    public MyServletContextAttributeListener() {
        System.out.println("MyServletContextAttributeListener Default Constructor");
    }
    
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
    	
    	System.out.println("Attribute Added().................");
    	String value = (String)event.getServletContext().getAttribute("username");
    	System.out.println("Listener Interface:::::" + value);
    }
    
    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
    	
    	System.out.println("Attribute Removed()..........");
    	String attributeName = event.getName();
    	System.out.println("Attribute name::::" + attributeName);
    }
	
}
