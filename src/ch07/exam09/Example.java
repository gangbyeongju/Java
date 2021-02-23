package ch07.exam09;

public class Example {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		driver.drive(new Vehicle());
		driver.drive(new Bus());
		driver.drive(new Taxi());
		
		
	}

}
