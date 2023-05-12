package main;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Atm atm = new Atm(scanner);
		
		atm.mainMenu();
	}

}
