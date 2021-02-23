package ch07.exam10;

public class Child extends Parent {
	//Field
	public int field2;
	//Constructor
	//Method
	@Override
	public void method2() {
		System.out.println("Child: method2() 실행");
	}
	
	public void method3() {
		System.out.println("Child: method3() 실행");
	}
}
