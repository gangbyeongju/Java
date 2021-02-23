package ch07.exam02;

public class Parent {
	//Field
	public String lastName;
	public String firstName;
	//Constructor
	public Parent(String lastName, String firstName) {
		System.out.println("Parent 按眉 积己");
		this.lastName = lastName;
		this.firstName = firstName;
	}
	//Method
	public void method1() {
		System.out.println("method1() 角青");
	}
}
