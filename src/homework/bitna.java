package homework;

import java.util.Scanner;

public class bitna {

	public static void main(String[] args) {
		boolean run  = true;
		int index = 0; //���ù���ȣ
		int count=0; //��ȸ��
		String title;
		String content;
		String writer;
		String[][] boardArray = new String[100][5];
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("1.��� | 2.����(Create) | 3.�б�(Read) | 4.����(Update) | 5.����(Delete) | 6.�α�ۺ���(Top5) | 7.����");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.print("�޴�����: ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {//���
					int totalNum = 0; //�Ѱ���
					for(int i=0; i<boardArray.length; i++) {
						if(boardArray[i][0] != null) {
							totalNum++;
						}
					}
				
					System.out.println("------------------------------");
					System.out.println("��ȣ| ���� | ���� | �۾��� | ��ȸ��       �� ����: " + totalNum );
					System.out.println("------------------------------");
					
					for(int j=index; j>=0; j--) {
						
						for(int i=0; i<boardArray.length; i++) {
							if(boardArray[i][0]==null) {
								continue;
							}else if(boardArray[i][0].equals(String.valueOf(j))) {
									System.out.print(boardArray[i][0] +"\t");
					                System.out.print(boardArray[i][1] +"\t");
					                System.out.print(boardArray[i][2] +"\t");
					                System.out.print(boardArray[i][3] +"\t");
					                System.out.println(boardArray[i][4] +"\t");
							}
						}
					}
					
					
					
					/*
					int[] check = new int[100]; //���
					for(int i=0; i<boardArray.length; i++) {
						if(boardArray[i][0]==null) { //nullPointerException �ذ� ����
							continue;
						}
						int max = 0;
						int listIndex = -1; 
						for(int j=0; j<boardArray.length; j++) { //�Խ��ǹ�ȣ max ã��
							if(boardArray[j][0]==null) {
								continue;
							}
							int num = Integer.parseInt(boardArray[j][0]); //�Խ��ǹ�ȣ
							if(max<=num && check[j]==0) { //[][0]�� �ִ� && ��¾���
								max = num;
								listIndex = j; //�Խ��ǹ�ȣ ���� ū �迭 �ε���
							}
						}
						
						if(listIndex!=-1) { //�Խ��ǹ�ȣ ���� ū �迭 ���
						 System.out.print(boardArray[listIndex][0] + "\t");
		                 System.out.print(boardArray[listIndex][1] + "\t");
		                 System.out.print(boardArray[listIndex][2] + "\t");
		                 System.out.print(boardArray[listIndex][3] + "\t");
		                 System.out.println(boardArray[listIndex][4]);
						 check[listIndex]=1; //��������� 1 -> �� �������� ū �Խ��ǹ�ȣ ã�� �� ����
						}
					}
					*/
				
			}else if(selectNo == 2) {//����
				index++;
				
				System.out.print("����: ");
				title = scanner.nextLine();
				System.out.print("����: ");
				content = scanner.nextLine();
				System.out.print("�۾���: ");
				writer = scanner.nextLine();
				
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0] == null) {
		                  boardArray[i][0] = String.valueOf(index);
		                  boardArray[i][1] = title;
		                  boardArray[i][2] = content;
		                  boardArray[i][3] = writer;
		                  boardArray[i][4] = "0";
		                  break;
		               }

				}
				
				//��� �̵�
				int totalNum = 0; //�Ѱ���
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0] != null) {
						totalNum++;
					}
				}
			
				System.out.println("------------------------------");
				System.out.println("��ȣ| ���� | ���� | �۾��� | ��ȸ��       �� ����: " + totalNum );
				System.out.println("------------------------------");
				
				for(int j=index; j>=0; j--) {
					
					for(int i=0; i<boardArray.length; i++) {
						if(boardArray[i][0]==null) {
							continue;
						}else if(boardArray[i][0].equals(String.valueOf(j))) {
								System.out.print(boardArray[i][0] +"\t");
				                System.out.print(boardArray[i][1] +"\t");
				                System.out.print(boardArray[i][2] +"\t");
				                System.out.print(boardArray[i][3] +"\t");
				                System.out.println(boardArray[i][4] +"\t");
						}
					}
				}
				
			}else if(selectNo == 3) {//�б�
				System.out.print("��ȣ: ");
				int readIndex = Integer.parseInt(scanner.nextLine());
				
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0]==null) {
						continue;
					}else if( boardArray[i][0].equals(String.valueOf(readIndex))) {
							count = Integer.parseInt(boardArray[i][4]);
							count++;
							boardArray[i][4] = String.valueOf(count);
							
							System.out.print("����: ");
							System.out.println(boardArray[i][1]);
							System.out.print("����: ");
							System.out.println(boardArray[i][2]);
							System.out.print("�۾���: ");
							System.out.println(boardArray[i][3]);
							System.out.print("��ȸ��: ");
							System.out.println(boardArray[i][4]);
							break;
						}
					
				}
				
			}else if(selectNo == 4) {//����
				System.out.print("��ȣ: ");
				int updateIndex = Integer.parseInt(scanner.nextLine());
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0]==null) {
						continue;
					}else if( boardArray[i][0].equals(String.valueOf(updateIndex))) {
							
							System.out.println("��������: " + boardArray[i][1]);
							System.out.print("��������: ");
							boardArray[i][1] = scanner.nextLine();
							System.out.println("��������: " + boardArray[i][2]);
							System.out.print("��������: ");
							boardArray[i][2] = scanner.nextLine();
							break;
						}
				
				}
				
				//����̵�
				int totalNum = 0; //�Ѱ���
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0] != null) {
						totalNum++;
					}
				}
			
				System.out.println("------------------------------");
				System.out.println("��ȣ| ���� | ���� | �۾��� | ��ȸ��       �� ����: " + totalNum );
				System.out.println("------------------------------");
				
				for(int j=index; j>=0; j--) {
					
					for(int i=0; i<boardArray.length; i++) {
						if(boardArray[i][0]==null) {
							continue;
						}else if(boardArray[i][0].equals(String.valueOf(j))) {
								System.out.print(boardArray[i][0] +"\t");
				                System.out.print(boardArray[i][1] +"\t");
				                System.out.print(boardArray[i][2] +"\t");
				                System.out.print(boardArray[i][3] +"\t");
				                System.out.println(boardArray[i][4] +"\t");
						}
					}
				}
				
			}else if(selectNo == 5) {//����
				System.out.print("��ȣ: ");
				int deleteIndex = Integer.parseInt(scanner.nextLine());
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0]==null) {
						continue;
					}else if( boardArray[i][0].equals(String.valueOf(deleteIndex))) {
							for(int j=0; j<5; j++) {
								boardArray[i][j] = null;
							}
							break;
						}
					
				}
				
				//����̵�
				int totalNum = 0; //�Ѱ���
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0] != null) {
						totalNum++;
					}
				}
			
				System.out.println("------------------------------");
				System.out.println("��ȣ| ���� | ���� | �۾��� | ��ȸ��       �� ����: " + totalNum );
				System.out.println("------------------------------");
				
				for(int j=index; j>=0; j--) {
					
					for(int i=0; i<boardArray.length; i++) {
						if(boardArray[i][0]==null) {
							continue;
						}else if(boardArray[i][0].equals(String.valueOf(j))) {
								System.out.print(boardArray[i][0] +"\t");
				                System.out.print(boardArray[i][1] +"\t");
				                System.out.print(boardArray[i][2] +"\t");
				                System.out.print(boardArray[i][3] +"\t");
				                System.out.println(boardArray[i][4] +"\t");
						}
					}
				}
				
				
			}else if(selectNo == 6) {//�α�� ����
				System.out.println("------------------------------");
				System.out.println("         �α�� Top5           ");
				System.out.println("��ȸ�� | ��ȣ | ���� | ���� | �۾��� ");
				System.out.println("------------------------------");
				
				int top5 = 0;
				int[] check = new int[100];
				for(int i=0; i<boardArray.length; i++) {
					
					if(top5 > 4) {
						break;
					}
					
					if(boardArray[i][4]==null) {
						continue;
					}
					int max = 0;
					int bestIndex = -1;
					for(int j=0; j<boardArray.length; j++) {
						if(boardArray[j][4]==null) {
							continue;
						}
						int num = Integer.parseInt(boardArray[j][4]);
						if(max<=num && check[j]==0) {
							max = num;
							bestIndex = j;
						}
					}
					if(bestIndex!=-1) {
						System.out.print(boardArray[bestIndex][4] + "\t");
		                System.out.print(boardArray[bestIndex][0] + "\t");
		                System.out.print(boardArray[bestIndex][1] + "\t");
		                System.out.print(boardArray[bestIndex][2] + "\t");
		                System.out.println(boardArray[bestIndex][3]);
						check[bestIndex]=1;
						top5++;
					}
					
				}
			
				
			}else if(selectNo == 7) {//����
				run = false;
			}
			
		}
		
		System.out.println("���α׷� ����");
	}

}
