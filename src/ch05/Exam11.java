package ch05;

import java.util.Arrays;

public class Exam11 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30};
		
		//index를 이용해서 반복
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		
		System.out.println();
		
		//저장된 값의 개수 만큼 반복
		for(int value : arr) {
			System.out.print(value + ",");
		}
		
	}

}
