package homework;

import java.util.Scanner;

public class hw0222 {

	public static void main(String[] args) {
		
		String[][] boardArray = new String[100][5];
		
		Scanner scanner = new Scanner(System.in);
		int count=0; // �Խù� ��ȣ
		
		while(true) {
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("1. ��� | 2. ����(Create) | 3. �б�(Read) | 4. ����(Update) | 5. ����(Delete) | 6. �α�� TOP5 |  7. ����");
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.print("�޴�����: ");
			
			String selectNo = scanner.nextLine();
			
			
			if(selectNo.equals("1")) {

				// ���� -> ��ȸ�� �ݿ� ���
				// ��ȸ�� ���� ����
				int boardCount = 0 ;
				for(int i=0; i < boardArray.length; i++) {
					if(boardArray[i][0] != null) {
						boardCount++;
					}
					
				}
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("�� �Խù� �� : " + boardCount);
				System.out.println("------------------------------------------------------------------------------------------------");
				
				System.out.print("��ȣ" + "\t");
				System.out.print("����" + "\t\t\t\t" );
				System.out.print("����" + "\t\t\t\t");
				System.out.print("�۾���" + "\t\t");
				System.out.print("��ȸ��" + "\t\n");
				System.out.println("------------------------------------------------------------------------------------------------");
				
				int[] check = new int[100]; // ����� �Խù����� �ƴ��� check�ϴ� �迭 
				for(int i=0;i<boardArray.length;i++) { // �Խù��� ����� for ��
					if(boardArray[i][0]==null) { // �Խù��� null�� ���
						continue;
					}
					int max = 0; //���� ū �Խ��� ��ȣ �ʱⰪ 0
					int index = -1;   //�Խ��� ��ȣ�� ���� Ŭ ���� �迭 �ε���
					for(int j=0;j<boardArray.length;j++) {//���� ū �Խ��� ��ȣ�� ã�� ���� for��
						if(boardArray[j][0]==null) { // �Խù��� null�� ���
							continue;
						}
						int num = Integer.parseInt(boardArray[j][0]); // ���� �Խ��� ��ȣ
						if(max<=num && check[j]==0) { //�Խ��� ��ȣ�� ���� ū ���̸鼭 ������� ���� �Խù��̸�
							max=num; //�Խ��� ��ȣ�� max�� ����
							index=j; //�Խ��� ��ȣ�� ���� ū �迭 �ε��� 
						}
					}
					
					if(index!=-1) { //����� �Խù��� �ִ°�? 
						System.out.print(boardArray[index][0] + "\t");
						System.out.print(boardArray[index][1] + "\t\t\t\t" );
						System.out.print(boardArray[index][2] + "\t\t\t\t");
						System.out.print(boardArray[index][3] + "\t\t");
						System.out.print(boardArray[index][4] + "\t\n");
						check[index]=1; //����� �Խù� üũ
					}
					
				}			
				
				
			} else if(selectNo.equals("2")) {
				System.out.print("����: ");
				String title = scanner.nextLine();
				System.out.print("����: ");
				String content = scanner.nextLine();
				System.out.print("�۾���: ");
				String writer = scanner.nextLine();
				
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {
						count++; // ������ �� ī��Ʈ ���� (�Խù� ��ȣ)
						String[] arr = {
								String.valueOf(count),
								title,
								content,
								writer,
								"0"
						};
						
						boardArray[i] = arr;
						break;
					}
				}
					
				// ���� -> ��ȸ�� �ݿ� ���
				// ��ȸ�� ���� ����
				int boardCount = 0 ;
				for(int i=0; i < boardArray.length; i++) {
					if(boardArray[i][0] != null) {
						boardCount++;
					}
					
				}
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("�� �Խù� �� : " + boardCount);
				System.out.println("------------------------------------------------------------------------------------------------");
				
				System.out.print("��ȣ" + "\t");
				System.out.print("����" + "\t\t\t\t" );
				System.out.print("����" + "\t\t\t\t");
				System.out.print("�۾���" + "\t\t");
				System.out.print("��ȸ��" + "\t\n");
				System.out.println("------------------------------------------------------------------------------------------------");
				
				int[] check = new int[100];
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {
						continue;
					}
					int max = 0;
					int index = -1;
					for(int j=0;j<boardArray.length;j++) {
						if(boardArray[j][0]==null) {
							continue;
						}
						int num = Integer.parseInt(boardArray[j][0]);
						if(max<=num && check[j]==0) {
							max=num;
							index=j;
						}
					}
					
					if(index!=-1) {
						System.out.print(boardArray[index][0] + "\t");
						System.out.print(boardArray[index][1] + "\t\t\t\t" );
						System.out.print(boardArray[index][2] + "\t\t\t\t");
						System.out.print(boardArray[index][3] + "\t\t");
						System.out.print(boardArray[index][4] + "\t\n");
						check[index]=1;
					}
					
				}			
				

				
			} else if(selectNo.equals("3")) {
				System.out.print("��ȣ: ");
				String number = scanner.nextLine();
				int i2 = -1; // �Խù��� �ִ��� ������ üũ
				int hits;
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {
						continue;
					}
					else if(boardArray[i][0].equals(number)) {
						i2=i;
					}
				}
				
				if(i2==-1) {
					System.out.println("�Խù��� �������� �ʽ��ϴ�.");
				} else {
					System.out.println("����: " + boardArray[i2][1]);
					System.out.println("����: " + boardArray[i2][2]);
					System.out.println("�۾���: " + boardArray[i2][3]);
					hits = Integer.parseInt(boardArray[i2][4]);
					hits++;
					boardArray[i2][4]=String.valueOf(hits);
					System.out.println("��ȸ��: " + boardArray[i2][4]);
				}
				
				
				
			} else if(selectNo.equals("4")) {
				System.out.print("��ȣ: ");
				String number = scanner.nextLine();
				int i2 = -1; // �Խù��� �ִ��� ������ üũ
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {
						continue;
					}
					else if(boardArray[i][0].equals(number)) {
						i2=i;
					}
				}
				
				if(i2==-1) {
					System.out.println("�Խù��� �������� �ʽ��ϴ�.");
				} else {
					System.out.println("��������: " + boardArray[i2][1]);
					System.out.print("��������: ");
					String title = scanner.nextLine();
					if(!title.equals("")) {
						boardArray[i2][1]=title;
					}
					System.out.println("��������: " + boardArray[i2][2]);
					System.out.print("��������: ");
					String content = scanner.nextLine();
					if(!content.equals("")) {
						boardArray[i2][2]=content;
					}
					
					// ���� -> ��ȸ�� �ݿ� ���
					// ��ȸ�� ���� ����
					int boardCount = 0 ;
					for(int i=0; i < boardArray.length; i++) {
						if(boardArray[i][0] != null) {
							boardCount++;
						}
						
					}
					System.out.println("------------------------------------------------------------------------------------------------");
					System.out.println("�� �Խù� �� : " + boardCount);
					System.out.println("------------------------------------------------------------------------------------------------");
					
					System.out.print("��ȣ" + "\t");
					System.out.print("����" + "\t\t\t\t" );
					System.out.print("����" + "\t\t\t\t");
					System.out.print("�۾���" + "\t\t");
					System.out.print("��ȸ��" + "\t\n");
					System.out.println("------------------------------------------------------------------------------------------------");
					
					int[] check = new int[100];
					for(int i=0;i<boardArray.length;i++) {
						if(boardArray[i][0]==null) {
							continue;
						}
						int max = 0;
						int index = -1;
						for(int j=0;j<boardArray.length;j++) {
							if(boardArray[j][0]==null) {
								continue;
							}
							int num = Integer.parseInt(boardArray[j][0]);
							if(max<=num && check[j]==0) {
								max=num;
								index=j;
							}
						}
						
						if(index!=-1) {
							System.out.print(boardArray[index][0] + "\t");
							System.out.print(boardArray[index][1] + "\t\t\t\t" );
							System.out.print(boardArray[index][2] + "\t\t\t\t");
							System.out.print(boardArray[index][3] + "\t\t");
							System.out.print(boardArray[index][4] + "\t\n");
							check[index]=1;
						}
						
					}			
						
					
				}
				

				
				
				
			} else if(selectNo.equals("5")) {
				System.out.print("��ȣ: ");
				String number = scanner.nextLine();
				int i2 = -1;
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {
						continue;
					}
					else if(boardArray[i][0].equals(number)) {
						i2=i;
					}
				}
				
				if(i2==-1) {
					System.out.println("�Խù��� �������� �ʽ��ϴ�.");
				} else {
					for(int j=0;j<boardArray[i2].length;j++) {
						boardArray[i2][j]=null;
					}
					
					// ���� -> ��ȸ�� �ݿ� ���
					// ��ȸ�� ���� ����
					int boardCount = 0 ;
					for(int i=0; i < boardArray.length; i++) {
						if(boardArray[i][0] != null) {
							boardCount++;
						}
						
					}
					System.out.println("------------------------------------------------------------------------------------------------");
					System.out.println("�� �Խù� �� : " + boardCount);
					System.out.println("------------------------------------------------------------------------------------------------");
					
					System.out.print("��ȣ" + "\t");
					System.out.print("����" + "\t\t\t\t" );
					System.out.print("����" + "\t\t\t\t");
					System.out.print("�۾���" + "\t\t");
					System.out.print("��ȸ��" + "\t\n");
					System.out.println("------------------------------------------------------------------------------------------------");
					
					int[] check = new int[100];
					for(int i=0;i<boardArray.length;i++) {
						if(boardArray[i][0]==null) {
							continue;
						}
						int max = 0;
						int index = -1;
						for(int j=0;j<boardArray.length;j++) {
							if(boardArray[j][0]==null) {
								continue;
							}
							int num = Integer.parseInt(boardArray[j][0]);
							if(max<=num && check[j]==0) {
								max=num;
								index=j;
							}
						}
						
						if(index!=-1) {
							System.out.print(boardArray[index][0] + "\t");
							System.out.print(boardArray[index][1] + "\t\t\t\t" );
							System.out.print(boardArray[index][2] + "\t\t\t\t");
							System.out.print(boardArray[index][3] + "\t\t");
							System.out.print(boardArray[index][4] + "\t\n");
							check[index]=1;
						}
						
					}			
				}
				
				
			} else if(selectNo.equals("6")) {
				int topCount = 1; // 5���� ����ϱ� ���� ����
				int[] check = new int[100];
				System.out.println("------------------------------------------------------------------------------------------------------");
				System.out.print("����" + "\t");
				System.out.print("��ȣ" + "\t");
				System.out.print("����" + "\t\t\t\t" );
				System.out.print("����" + "\t\t\t\t");
				System.out.print("�۾���" + "\t\t");
				System.out.print("��ȸ��" + "\t\n");
				System.out.println("------------------------------------------------------------------------------------------------------");
				
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {
						continue;
					} else {
						if (topCount > 5) { // �α�� 5���� �Ѿ��? ������
							break;
						} else {
							int max = 0;
							int index = -1;
							for(int j=0;j<boardArray.length;j++) {
								if(boardArray[j][4]==null) { //  ��ȸ���� null�̸� �Ѿ��
									continue;
								}
								int num = Integer.parseInt(boardArray[j][4]);
								if(max<=num && check[j]==0) { // �ִ밪 ��
									max=num;
									index=j;
								}
							}
							
							if(index!=-1) { // ����� �Խù��� �ִ°�?
								if(boardArray[index][4].equals("0")) { // �Խù��� ��ȸ���� 0�̶�� �������� �ʴ´�
									break;
								} else {
									System.out.print(topCount + "��\t");
									System.out.print(boardArray[index][0] + "\t");
									System.out.print(boardArray[index][1] + "\t\t\t\t" );
									System.out.print(boardArray[index][2] + "\t\t\t\t");
									System.out.print(boardArray[index][3] + "\t\t");
									System.out.print(boardArray[index][4] + "\t\n");
									check[index]=1; // ����� �Խù� üũ
									topCount++; // �α�� �߰�
								}
								
							}
							
						}
					}
				
				}	

			} else if(selectNo.equals("7")) {
				System.out.println("���α׷� ����");
				break;
				
			} else {
				System.out.println("�ٽ� �������ּ���.");
			}
			
			System.out.println();
		}

	}

}
