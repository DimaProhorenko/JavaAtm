package main;
import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Utils {
	private static Random rand = new Random();
	
	public static int generateRandomNum(int min, int max) {
		return min + (rand.nextInt(max - min));
	}
	
	public static void appendToFile(String filePath, String dataString) {
		try {
			String newLine = "\n";
			File file = new File(filePath);
			if (!file.exists()) {
				file.createNewFile();
				newLine = "";
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
			bw.write(newLine + dataString);
			bw.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
