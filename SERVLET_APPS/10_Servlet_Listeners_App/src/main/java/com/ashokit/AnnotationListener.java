package com.ashokit;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AnnotationListener implements ServletRequestListener {

	public AnnotationListener() {
		System.out.println("Annotation Listener.....");
	}
	 @Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		ServletRequestListener.super.requestInitialized(sre);
	}
	 
	 @Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		ServletRequestListener.super.requestDestroyed(sre);
	}
}
