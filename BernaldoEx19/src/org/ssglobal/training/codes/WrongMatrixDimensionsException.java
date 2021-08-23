package org.ssglobal.training.codes;

@SuppressWarnings("serial")
public class WrongMatrixDimensionsException extends Exception {
	
	private String message = "Wrong matrix dimensions";
	
	public WrongMatrixDimensionsException() {}
	
	public WrongMatrixDimensionsException(String newMessage) {
		message = newMessage;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void printStackTrace() {
		System.err.println(message);
	} 

}
