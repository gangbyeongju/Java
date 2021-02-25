package ch11.exam02;

import java.util.Date;

public class Example {

	public static void main(String[] args) {
		
		Object var1 = new Object();
		System.out.println(var1.toString());
		
		Date var2 = new Date();
		System.out.println(var2.toString());
		
		String var3 = "abc";
		System.out.println(var3.toString());
		
		Member var4 = new Member("winter", "¥ ∞‹øÔ");
		System.out.println(var4.toString());
		System.out.println(var4);
		
		String result = var4 + " => spring: ∫Ωµπ¿Ã";
		System.out.println(result);
	
	}

}
