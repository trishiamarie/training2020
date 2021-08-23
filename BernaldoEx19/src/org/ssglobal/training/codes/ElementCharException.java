package org.ssglobal.training.codes;

@SuppressWarnings("serial")
public class ElementCharException extends Exception {

	private String message = "invalid character and string array element";
	
	public ElementCharException() {

	}
	
	public ElementCharException(String newMessage) {
		message = newMessage;
		
	}	
	public String getMessage() {
		return message;
		
	}
	
	public void printStackTrace() {
		System.err.println(message); 
	}
}
