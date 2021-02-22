package ch04homework;

import java.util.Scanner;
public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출급 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			int num1 = Integer.parseInt(scanner.nextLine());
			if(num1==1) {
				System.out.print("예금액> ");
				int num2 = Integer.parseInt(scanner.nextLine());
				balance+=num2;
			} else if(num1==2) {
				System.out.print("출금액> ");
				int num2 = Integer.parseInt(scanner.nextLine());
				balance-=num2;
			} else if(num1==3) {
				System.out.println("잔고> "+balance);
			} else {
				System.out.println();
				break;
			}
			System.out.println();

		}
		
		System.out.println("프로그램 종료");
		
	}

}
