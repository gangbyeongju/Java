package ch18.exam09;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example {

	public static void main(String[] args) {
		
		String filePath = "D:\\Team4Projects\\Java\\src\\ch18\\exam09\\data.txt";
		try {
			Writer writer = new FileWriter(filePath);
			
			writer.write(new char[] {'A', '한'});
			writer.write(new char[] {'B', '글', 'C', 'D'}, 0, 2);
			writer.write("오늘은 날씨가 화창합니다.");
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
