package ch18.exam18;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Example2 {

	public static void main(String[] args) throws Exception {
		
		String filePath1 = "D:\\Team4Projects\\Java\\src\\ch18\\exam18\\data.db";
		InputStream is = new FileInputStream(filePath1);
		DataInputStream dis = new DataInputStream(is);
		
		int var1 = dis.readInt();
		double var2 = dis.readDouble();
		boolean var3 = dis.readBoolean();
		String var4 = dis.readUTF();
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		dis.close();
		
	}

}
