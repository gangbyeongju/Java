package ch11.exam07;

public class Example3 {

	public static void main(String[] args) {
		
		/*
		Integer var1 = new Integer(500);
		Integer var2 = new Integer(500);
		
		Integer var1 = 500;
		Integer var2 = 500;
		*/
		
		Integer var1 = 10;
		Integer var2 = 10; //-128~127 은 자동으로 객체 공유
		
		System.out.println(var1 == var2);  //값의 범위에 따라서 다른 값
		System.out.println(var1.equals(var2));  //결론 : 이 형식을 사용하라.
		
	}

}
