package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {
		
		try {
			InputStream is = System.in;
			while(true) {
				int keyCode = is.read();
				System.out.println(keyCode);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
