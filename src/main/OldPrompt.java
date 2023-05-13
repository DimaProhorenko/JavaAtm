package main;
import prompts.Prompt;

public class OldPrompt extends Prompt {
	protected String message;
	protected String error;
	
	public OldPrompt(String message, String error) {
		super(message, error);
		this.message = message;
		this.error = error;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getError() {
		return error;
	}
	
	public boolean validate(String input) {
		return true;
	}
}
