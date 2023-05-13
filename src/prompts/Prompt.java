package prompts;

public abstract class Prompt {
	protected String message;
	protected String error;
	
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
	
	abstract public boolean validate(String input);
}
