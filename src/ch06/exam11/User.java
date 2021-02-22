package ch06.exam11;

public class User {
	//Field
	String id;
	String name;
	String password;
	static String nation = "한국";
	
	//Constructor
	User(String name){
		this.name = name;
	}
	
	//Method
	static void info() {
		System.out.println("모든 User는 한국인입니다.");
	}
	
	void login() {
		System.out.println(name + "님이 로그인합니다");
	}
	
	void logout() {
		System.out.println(name + "님이 로그아웃합니다");
	}
	
}
