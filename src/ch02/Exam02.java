package ch02;

public class Exam02 {

	public static void main(String[] args) {
		
		//자동 타입 변환
		byte var1 = 10;
		int var2 = var1;
		System.out.println("var2: " + var2);
		
		//강제 타입 변환
		int var3 = 10;
		byte var4 = (byte) var3;
		System.out.println("var4: " + var4);
		
		//-----------------------------------
		
		//자동 타입 변환 (정수는 실수보다 항상 작은 범위)
		long var5 = 10;
		float var6 = var5;
		System.out.println("var6: " + var6);
		
		//강제 타입 변환 (실수는 정수보다 항상 큰 범위)
		float var7 = 10.5f;
		long var8 = (long) var7;
		System.out.println("var8: " + var8); //10

		//-----------------------------------
		
		//실수를 정수로 변환
		double var9 = 3.14;
		int var10 = (int) var9;
		System.out.println("var10: " + var10); //3
		
	}

}
