package main;
import java.util.Random;

public class Utils {
	private static Random rand = new Random();
	public static int generateRandomNum(int min, int max) {
		return min + (rand.nextInt(max - min));
	}
}
