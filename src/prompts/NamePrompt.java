package prompts;

public class NamePrompt extends Prompt {
	
	public NamePrompt() {
		super("Enter your name", "Can not be empty String");
	}
	
	public boolean validate(String input) {
		if (input.length() > 0) return true;
		return false;
	}
}
