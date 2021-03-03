package ch18.exam14;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		try {
			String filePath = "D:\\Team4Projects\\Java\\src\\ch18\\exam14\\data.txt";
			InputStream is = new FileInputStream(filePath);
			Scanner scanner = new Scanner(is);
			int count = 1;
			while(true) {
				try {
					String data = scanner.nextLine();
					System.out.println(count + ": " + data);
					count++;
				} catch(NoSuchElementException e) {
					break;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
