package main;

public class Prompt {
	private String message;
	private String error;
	
	public Prompt(String message, String error) {
		this.message = message;
		this.error = error;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getError() {
		return error;
	}
}
