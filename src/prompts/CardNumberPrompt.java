package prompts;

import main.Constants;

public class CardNumberPrompt extends Prompt {
	
	public CardNumberPrompt() {
		super("Enter card number", "Card number length must be " + Constants.ACCOUNT_NUMBER_LENGTH + " digits");
	}
	
	public boolean validate(String cardNumber) {
		if (cardNumber.length() == Constants.ACCOUNT_NUMBER_LENGTH) {
			return true;
		}
		return false;
	}

}
