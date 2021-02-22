package ch06.exam05;

public class Korean {
	//Field
	String nation = "ÇÑ±¹";
	String name;
	String ssn;
	int age;
	
	//Constructor Over loading
	Korean() {
	}
	
	Korean(String name) {
		this.name = name;
	}
	
	Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean(String name, String ssn, int age) {
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
	
	
}
