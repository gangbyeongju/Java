package ch15.exam05;

import java.io.FileReader;
import java.util.Properties;

public class Example {

	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		String path = Example.class.getResource("database.properties").getPath();
		prop.load(new FileReader(path));
		
		String driver = prop.getProperty("driver");
		System.out.println(driver);
		
		String nation = prop.getProperty("nation");
		System.out.println(nation);
		
	}

}
