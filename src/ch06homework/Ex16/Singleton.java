package ch06homework.Ex16;

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
