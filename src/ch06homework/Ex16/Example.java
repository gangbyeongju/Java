package ch06homework.Ex16;

public class Example {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		if(obj1 == obj2) {
			System.out.println("같은 객체를 참조");
		} else {
			System.out.println("다른 객체를 참조");
		}
	}

}
