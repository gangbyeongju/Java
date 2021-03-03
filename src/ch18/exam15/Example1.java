package ch18.exam15;

import java.io.File;

public class Example1 {

	public static void main(String[] args) {
		
		File file = new File("C:/Temp/data.txt");
		if(file.isDirectory()) {
			System.out.println("폴더입니다.");
		} else {
			System.out.println("파일입니다.");
		}
		
		file = new File("C:/Temp/data.txt");
		if(file.isFile()){
			long size = file.length();
			System.out.println(size + "bytes");
		}
		
	}

}
