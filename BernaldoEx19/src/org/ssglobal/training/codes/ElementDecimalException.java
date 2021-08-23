package org.ssglobal.training.codes;

@SuppressWarnings("serial")
public class ElementDecimalException extends Exception {

	private String message = "invalid real number element";
	
	public ElementDecimalException() {

	}
	
	public ElementDecimalException(String newMessage) {
		message = newMessage;
		
	}	
	public String getMessage() {
		return message;
		
	}
	
	public void printStackTrace() {
		System.err.println(message); 
	}
}
