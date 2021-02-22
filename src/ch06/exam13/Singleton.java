package ch06.exam13;

public class Singleton {
	
	//Field
	private static Singleton singleton = new Singleton();
	
	//Constructor
	private Singleton() {
	}
	
	//Method
	static Singleton getInstance() {
		return singleton;
	}
	
}
