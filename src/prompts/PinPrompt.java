package prompts;

import main.Constants;

public class PinPrompt extends Prompt {
	
	public PinPrompt() {
		super("Enter Pin: ", "Pin must be 4 digits");
	}
	
	public boolean validate(String pin) {
		if (pin.length() == Constants.PIN_LENGTH && pin.matches("\\d+")) {
			return true;
		}
		return false;
	}
}
