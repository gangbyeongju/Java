package ch06homework.Excercise20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
	
	private static void createAccount() {
		System.out.println("--------");
		System.out.println("���»���");
		System.out.println("--------");
		System.out.print("���¹�ȣ: ");
		String acNum = scanner.nextLine();
		System.out.print("������: ");
		String acUser = scanner.nextLine();
		System.out.print("�ʱ��Աݾ�: ");
		int acBal = Integer.parseInt(scanner.nextLine());
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {
				accountArray[i] = new Account(null,null,0);
				accountArray[i].setAno(acNum);
				accountArray[i].setOwner(acUser);
				accountArray[i].setBalance(acBal);
				break;
			}
		}
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
	}
	
	private static void accountList() {
		System.out.println("--------");
		System.out.println("���¸��");
		System.out.println("--------");
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				continue;
			} else {
				System.out.println(accountArray[i].getAno()+"\t"+accountArray[i].getOwner()+"\t"+accountArray[i].getBalance());

			}
		}
	}
	
	private static void deposit() {
		System.out.println("--------");
		System.out.println("����");
		System.out.println("--------");
		System.out.print("���¹�ȣ: ");
		String acNum = scanner.nextLine();
		System.out.print("���ݾ�: ");
		int acBal = Integer.parseInt(scanner.nextLine());
		findAccount(acNum).setBalance(acBal+findAccount(acNum).getBalance());
		System.out.println("���: ������ �����Ǿ����ϴ�.");
		
	}
	
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("����");
		System.out.println("--------");
		System.out.print("���¹�ȣ: ");
		String acNum = scanner.nextLine();
		System.out.print("��ݾ�: ");
		int acBal = Integer.parseInt(scanner.nextLine());
		findAccount(acNum).setBalance(findAccount(acNum).getBalance()-acBal);
		System.out.println("���: ����� �����Ǿ����ϴ�.");		
	}
	
	private static Account findAccount(String ano) {
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}
}
