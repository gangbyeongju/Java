package ch11.exam01;

public class Example {

	public static void main(String[] args) {
		
		Member m1 = new Member("winter", "´Ê°Ü¿ï");
		Member m2 = new Member("winter", "´Ê°Ü¿ï");
		
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
	}
	
}
