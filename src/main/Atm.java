package main;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Atm {
	private Scanner scanner;
	
	public Atm(Scanner scanner) {
		this.scanner = scanner;
	}

	public void mainMenu() {
		greeting();
		int nextMenu = mainOptions();
		
		switch (nextMenu) {
		case 1: {
			createAccount();
		}
		}
	}
	
	public void greeting() {
		System.out.println("Welcome to ATM!");
	}
	
	public int mainOptions() {
		int decision = -1;
		
		while (true) {
			System.out.println("Create account - enter 1: ");
			decision = Integer.parseInt(scanner.nextLine());
			if (decision == 1) break;
			
		}
		
		return decision;
		
	}
	
	public void createAccount() {
		Prompt[] prompts = {
				new Prompt("Enter your name", "Name must be at least 1 char"),
				new Prompt("Enter 4 digit pin", "Pin must have 4 digits")
		};
		String name;
		String pin;
		
		while(true) {
			System.out.println(prompts[0].getMessage());
			name = scanner.nextLine();
			if (name.length() >= 4) {
				break;
			}
			System.out.println(prompts[0].getError());
		}
		
		while(true) {
			System.out.println(prompts[1].getMessage());
			pin = scanner.nextLine();
			
			if (pin.length() == 4 && Integer.parseInt(pin) > 0) {
				break;
			}
			System.out.println(prompts[1].getError());
		}
		
		Account acc = new Account(name, pin);
		Utils.appendToFile(Constants.SAVE_FILE_PATH, acc.toString().replace("\n", ""));
	}
	
}
