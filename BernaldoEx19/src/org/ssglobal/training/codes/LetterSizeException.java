package org.ssglobal.training.codes;

@SuppressWarnings("serial")
public class LetterSizeException extends Exception {

	private String message = "error letter size";
	
	public LetterSizeException() {

	}
	
	public LetterSizeException(String newMessage) {
		message = newMessage;
		
	}	
	public String getMessage() {
		return message;
		
	}
	
	public void printStackTrace() {
		System.err.println(message); 
	}
}
	