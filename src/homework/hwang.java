package homework;

import java.util.Scanner;

public class hwang {

	public static void main(String[] args) {
		String[][] boardArray = new String[100][5];
		
		Scanner scanner = new Scanner(System.in);
		int count=0;
		
		// �� �ڵ� => �׽�Ʈ �� (�Խù� �ֱ� �����Ƽ� �ӽ÷� ����)
		for(int i =0; i < 10; i++) {
			count++;
			boardArray[i][0] = String.valueOf(count);
			boardArray[i][1] = "���� " + String.valueOf(i+1);
			boardArray[i][2] = "���� " + String.valueOf(i+1);
			boardArray[i][3] = "�۾��� " + String.valueOf(i+1);
			boardArray[i][4] = String.valueOf(i+1);
		}
		
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
				
				
			} else if(selectNo.equals("2")) {
				System.out.print("����: ");
				String title = scanner.nextLine();
				System.out.print("����: ");
				String content = scanner.nextLine();
				System.out.print("�۾���: ");
				String writer = scanner.nextLine();
				
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {
						count++;
						String[] arr = {
								Integer.toString(count),
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
				int i2 = -1;
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
					boardArray[i2][4]=Integer.toString(hits);
					System.out.println("��ȸ��: " + boardArray[i2][4]);
				}
				
				
				
			} else if(selectNo.equals("4")) {
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
				int topCount = 1;
				int[] check = new int[100];
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.print("��ȣ" + "\t");
				System.out.print("����" + "\t\t\t\t" );
				System.out.print("����" + "\t\t\t\t");
				System.out.print("�۾���" + "\t\t");
				System.out.print("��ȸ��" + "\t\n");
				System.out.println("------------------------------------------------------------------------------------------------");
				
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {
						continue;
					} else {
						if (topCount > 5) {
							break;
						} else {
							int max = 0;
							int index = -1;
							for(int j=0;j<boardArray.length;j++) {
								if(boardArray[j][4]==null) {
									continue;
								}
								int num = Integer.parseInt(boardArray[j][4]);
								if(max<=num && check[j]==0) {
									max=num;
									index=j;
								}
							}
							
							if(index!=-1) {
								if(boardArray[index][4].equals("0")) {
									break;
								} else {
									System.out.print(boardArray[index][0] + "\t");
									System.out.print(boardArray[index][1] + "\t\t\t\t" );
									System.out.print(boardArray[index][2] + "\t\t\t\t");
									System.out.print(boardArray[index][3] + "\t\t");
									System.out.print(boardArray[index][4] + "\t\n");
									check[index]=1;
									topCount++;
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
