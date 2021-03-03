package ch18.exam13;

import java.io.Console;

public class Example {

	public static void main(String[] args) {
		
		Console console = System.console();
		
		System.out.print("아이디:");
		String id = console.readLine();
		
		System.out.print("비밀번호:");
		String password = new String(console.readPassword());
		System.out.println(id);
		System.out.println(password);
		
	}

}
