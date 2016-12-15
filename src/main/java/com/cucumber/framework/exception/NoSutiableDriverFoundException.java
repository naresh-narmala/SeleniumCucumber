package com.cucumber.framework.exception;

/**
 * @author Naresh Narmala
 *
 * December 13, 2016
 */
public class NoSutiableDriverFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoSutiableDriverFoundException(String message) {
		super(message);
	}
	
	public NoSutiableDriverFoundException(){
		this("");
	}

}
