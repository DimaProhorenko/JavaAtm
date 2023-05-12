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
			decision = scanner.nextInt();
			if (decision == 1) break;
			
		}
		
		return decision;
		
	}
	
	public void createAccount() {
		Prompt[] prompts = {
				new Prompt("Enter your name", "Name must be at least 1 char"),
				new Prompt("Enter 4 digit password", "Password must have 4 digits")
		};
	}
	
}
