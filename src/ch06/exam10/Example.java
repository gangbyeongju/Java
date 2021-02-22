package ch06.exam10;

public class Example {

	public static void main(String[] args) {
		Changer changer = new Changer();
		
		//Call by Value(값을 복사해서 호출)
		int v1 = 1;
		changer.change(v1);
		System.out.println(v1);
		
		//Call by Reference(번지를 복사해서 호출)
		String v3 = "A";
		changer.change(v3);
		System.out.println(v3);
		
		//Call by Reference(번지를 복사해서 호출)
		int[] arr1 = {0, 0, 0};
		changer.change(arr1);
		System.out.println(arr1[0]);
		
		//Call by Reference(번지를 복사해서 호출)
		String[] arr3 = {"A", "B", "C"};
		changer.change(arr3);
		System.out.println(arr3[0]);
		
		//Call by Reference(번지를 복사해서 호출)
		Member m1 = new Member();
		System.out.println(m1.age);
		changer.change(m1);
		System.out.println(m1.age);
	}

}
