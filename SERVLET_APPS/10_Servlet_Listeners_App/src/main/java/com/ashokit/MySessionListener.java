package com.ashokit;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener{
	
	private static int noOfClientsConnected;
	
	public MySessionListener() {
		System.out.println("MySessionListener Constructor!!!!!");
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("Inside the Session Created!!!!!");
		noOfClientsConnected++;
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("Inside the Session Destroyed!!!!" + se.getSession());
		noOfClientsConnected--;
	}
	
	public static int getNoOfClientsConnected() {
		return noOfClientsConnected;
	}
}