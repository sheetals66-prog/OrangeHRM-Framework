package com.exceptions;

public class InvalidBrowserNameException extends RuntimeException{
	String browsername;
 public void InvalidBrowserNameException(String browsername) {
	 this.browsername=browsername;
	
}
 @Override
 public String getMessage() {
	return browsername+"browser is not supported";
	 
 }
}
