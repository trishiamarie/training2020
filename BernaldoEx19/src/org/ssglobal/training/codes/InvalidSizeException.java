package org.ssglobal.training.codes;

@SuppressWarnings("serial")
public class InvalidSizeException extends Exception {

	private String message = "invalid letter size";
	
	public InvalidSizeException() {

	}
	
	public InvalidSizeException(String newMessage) {
		message = newMessage;
		
	}	
	public String getMessage() {
		return message;
		
	}
	
	public void printStackTrace() {
		System.err.println(message); 
	}
}

