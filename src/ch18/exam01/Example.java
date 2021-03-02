package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {
		
		String filePath = "C:/Users/user/git/Java/src/ch18/exam01/data.txt";
		try {
			InputStream is = new FileInputStream(filePath);
			
			/* ¹æ¹ý1
			while(true) {
				int data = is.read();
				if(data == -1) {
					break;
				}
				System.out.println(data);
			}*/
			int data = -1;
			while((data = is.read()) != -1) {
				System.out.print(data);
			}
			is.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
