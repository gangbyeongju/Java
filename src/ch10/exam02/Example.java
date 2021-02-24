package ch10.exam02;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				int value = Integer.parseInt(scanner.nextLine());
				System.out.println("value:" + value);
			} catch(NumberFormatException e) {
				System.out.println("숫자만 가능합니다.");
				System.out.println("프로그램을 종료합니다.");
				return;
			} finally {
				System.out.println("다시 입력하세요.");
			}
		}	
	}

}
