package ch07.exam03;

public class Child extends Parent {
	//Field
	//Constructor
	public Child(String firstName) {
		super("辫", firstName);
		System.out.println("Child 按眉 积己");
	}
	//Method
	public void method2() {
		System.out.println("method2() 角青");
	}
	
	@Override
	public void sound() {
		System.out.println("饺绢夸~~~~");
	}
}
