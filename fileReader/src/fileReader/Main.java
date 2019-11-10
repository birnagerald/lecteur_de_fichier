package fileReader;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		
		FileReader file = new FileReader("C:/Users/birna/Documents/LP/java/fileReader/test_file.txt");
		FileReader fileCompare1 = new FileReader("C:/Users/birna/Documents/LP/java/fileReader/test_file.txt");
		FileReader fileCompare2 = new FileReader("C:/Users/birna/Documents/LP/java/fileReader/test_file_2.txt");

		
		file.readFile();
		System.out.println("---------------File Content---------------");
		file.displayFile();
		System.out.println("---------------Reverse File Content---------------");
		file.displayFileUpDown();
		System.out.println("---------------Palindrome Content---------------");
		file.displayFile();
		file.readFilePal();

		// Testing if our files are identical
		fileCompare1.readFile();
		fileCompare2.readFile();
		ArrayList<String> ff = fileCompare1.readFileByCara();
		ArrayList<String> ft = fileCompare2.readFileByCara();
		System.out.println("\n---------------Are the files identical?--------------- ");

		if (ff.equals(ft)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}