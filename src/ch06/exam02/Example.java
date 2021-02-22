package ch06.exam02;

public class Example {

	public static void main(String[] args) {
		
		//객체 생성
		Car mycar = new Car();
		
		//필드의 값을 읽기
		System.out.println(mycar.company);
		System.out.println(mycar.model);
		System.out.println(mycar.price);
		System.out.println(mycar.old);
		System.out.println(mycar.speed);
		
		//필드의 값을 변경
		mycar.company = "현대자동차";
		mycar.model = "그랜저";
		mycar.price = 30000000;
		mycar.old = true;
		mycar.speed = 60;
		
		//필드의 값을 읽기
		System.out.println(mycar.company);
		System.out.println(mycar.model);
		System.out.println(mycar.price);
		System.out.println(mycar.old);
		System.out.println(mycar.speed);
		
		//다른 객체 생성
		Car yourcar = new Car();
		
		
	}

}
