package ch04homework;

import java.util.Scanner;
public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			System.out.print("����> ");
			
			int num1 = Integer.parseInt(scanner.nextLine());
			if(num1==1) {
				System.out.print("���ݾ�> ");
				int num2 = Integer.parseInt(scanner.nextLine());
				balance+=num2;
			} else if(num1==2) {
				System.out.print("��ݾ�> ");
				int num2 = Integer.parseInt(scanner.nextLine());
				balance-=num2;
			} else if(num1==3) {
				System.out.println("�ܰ�> "+balance);
			} else {
				System.out.println();
				break;
			}
			System.out.println();

		}
		
		System.out.println("���α׷� ����");
		
	}

}
