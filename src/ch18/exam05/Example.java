package ch18.exam05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		String filePath = "C:/Users/user/git/Java/src/ch18/exam05/data.txt";
		try {
			OutputStream os = new FileOutputStream(filePath);
			byte[] arr = {65, 66, 67};
			os.write(arr);
			os.write(arr, 0 , arr.length);
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
