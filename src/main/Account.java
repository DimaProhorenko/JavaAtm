package main;
import java.lang.StringBuilder;

public class Account {
	private String accountNumber;
	private String name;
	private double balance = 0.0;
	private int cvc;
	private int id;
	private static int idCounter = 0;
	private String password;
	
	public Account(String name, String password) {
		this.name = name;
		this.password = password;
		cvc = generateCvc();
		accountNumber = generateAccountNumber();
		id = idCounter++;
	}
	
	public int generateCvc() {
		return Utils.generateRandomNum(Constants.CVC_MIN, Constants.CVC_MAX);
	}
	
	public String generateAccountNumber() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Constants.ACCOUNT_NUMBER_LENGTH; i++) {
			sb.append(Utils.generateRandomNum(0, 9));
		}
		return sb.toString();
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getCvc() {
		return cvc;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s,\nPassword: %s,\nAccountNumber: %s,\ncvc: %d,\nID: %d,\nBalance: %f", name, password, accountNumber, cvc, id, balance);
	}
}
