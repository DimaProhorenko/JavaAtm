package main;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

import prompts.Prompt;
import prompts.CardNumberPrompt;
import prompts.PinPrompt;
import prompts.NamePrompt;

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
			login();
			break;
		}
		case 2: {
			login();
			break;
		}
		}
	}
	
	public void greeting() {
		System.out.println("Welcome to ATM!");
	}
	
	public int mainOptions() {
		int decision = -1;
		
		while (true) {
			System.out.println("Create account - enter 1\nLogin - enter 2");
			decision = Integer.parseInt(scanner.nextLine());
			if (decision == 1) break;
			
		}
		
		return decision;
		
	}
	
	public void createAccount() {
		Prompt[] prompts = {
				new NamePrompt(),
				new PinPrompt()
		};
		
		String[] userData = Utils.showMenu(prompts, scanner);
		String name = userData[0];
		String pin = userData[1];
		
		Account acc = new Account(name, pin);
		Utils.appendToFile(Constants.SAVE_FILE_PATH, acc.toString().replace("\n", ""));
		System.out.println("Account created, redirecting to login...");
	}
	
	public boolean login() {
		System.out.println("Log in");
		System.out.println("Enter the following data to login...");
		Prompt[] prompts = {
				new CardNumberPrompt(),
				new PinPrompt(),
				
		};
		String[] result = Utils.showMenu(prompts, scanner);
		
		return true;
	}
	
}
