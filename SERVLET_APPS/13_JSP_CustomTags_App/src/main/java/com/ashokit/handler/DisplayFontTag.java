package com.ashokit.handler;

import java.io.IOException;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;
public class DisplayFontTag extends TagSupport{
	
	private static final long serialVersionUID = 1L;
	
	 private String font;
	 private int size=10;
	 private String fontWeight="Regular";

	 //generates the setters & getters 
	 public void setFont(String font){
		 this.font = font;
	 }
	 public void setSize(int size){
		 this.size = size;
	 }
	 
	 public String getFont(){
		 return font;
	 }
	 
	 public int getSize(){
		 return size;
	 }
	 
	 public void setFontWeight(String fontWeight) {
		this.fontWeight = fontWeight;
	}
	 
	public String getFontWeight() {
		return fontWeight;
	}
	
      public int doStartTag(){
		   System.out.println("Inside the doStartTag()..............");
		   try{
			   JspWriter out = pageContext.getOut();
			   out.println("<span style=\"font-size:"+size+"px;"+"font-family:"+font+";font-weight:"+fontWeight+"\">");
		   }catch(IOException ioe){
			   System.out.println("Error in the ExampleTag:" + ioe);
		   }
		   return EVAL_BODY_INCLUDE;
	  }

	  public int doEndTag(){
		  System.out.println("Inside the doEndTag()..................");
		  try{			    
			    JspWriter out = pageContext.getOut();
				out.print("</span>");
		  }catch(IOException ioe){
			  ioe.printStackTrace();
		  }
		   return EVAL_PAGE;
	  }
}