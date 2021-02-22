package ch06.exam10;

public class Changer {
	//Field
	//Constructor
	//Method
	void change(int v2) {
		v2 = 2;
	}
	
	void change(String v4) {
		v4 = "B";
	}
	
	void change(int[] arr2) {
		arr2[0] = 2;
	}
	
	void change(String[] arr3) {
		arr3[0] = "B";
	}
	
	void change(Member m2) {
		m2.age = 2;
	}
}
