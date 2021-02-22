package ch05;

import java.util.Arrays;

public class Exam06 {

	public static void main(String[] args) {
		
		//배열을 생성
		String[] arr1 = new String[3];
		
		//배열 항모그이 값을 읽고 출력
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		//배열 항목의 값을 변경
		arr1[0] = "홍길동";
		arr1[1] = "홍자바";
		arr1[2] = "홍개발";
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		//배열 항목 비교
		System.out.println(arr1[0].equals("홍길동"));
		System.out.println(!arr1[1].equals("홍자바"));
		
	}

}
