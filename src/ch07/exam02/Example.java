package ch07.exam02;

public class Example {

	public static void main(String[] args) {
		
		Child child = new Child("±æµ¿");
		System.out.println(child.firstName);
		System.out.println(child.lastName);
		child.method1();
		child.method2();
		
	}

}
