package ch18.exam07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Example {

	public static void main(String[] args) {
		
		String filePath = "D:\\Team4Projects\\Java\\src\\ch18\\exam07\\data.txt";
		try {
			Reader reader = new FileReader(filePath);
			/*FileInputStream fis = new FileInputStream(filePath);
			Reader reader = new InputStreamReader(fis, "UTF-8");*/
			
			//规过1
			/*while(true) {
				int charCode = reader.read();
				if(charCode == -1) {
					break;
				}
				char charData = (char) charCode;
				System.out.println(charCode + ": " + charData);
			}*/
			
			//规过2
			int charCode = -1;
			while((charCode = reader.read()) != -1) {
				char charData = (char) charCode;
				System.out.println(charCode + ": " + charData);
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
