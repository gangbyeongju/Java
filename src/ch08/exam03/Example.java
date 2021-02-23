package ch08.exam03;

public class Example {

	public static void use1(Shipable shipable) {
		shipable.sailing();
		shipable.anchor();
	}
	
	public static void use2(Flyable flyable) {
		flyable.takeOff();
		flyable.fly();
		flyable.land();
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		use1(myCar);
		use2(myCar);
	}

}
