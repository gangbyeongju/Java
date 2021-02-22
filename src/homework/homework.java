package homework;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		
		String[][] boardArray = new String[100][5];
		
		Scanner scanner = new Scanner(System.in);
		int count=0;
		while(true) {
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("1. 목록 | 2. 생성(Create) | 3. 읽기(Read) | 4. 수정(Update) | 5. 삭제(Delete) | 6. 인기글 TOP 5 | 7. 종료");
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.print("메뉴선택: ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			
			if(selectNo == 1) {
				int cnt = 0;
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {
						continue;
					}
					cnt++;
				}
				
				System.out.println("-----------------------------------------------------------------------------------");
				System.out.println("   번호        제목                      내용                       글쓴이        조회수       총 게시글 수 : "+cnt);
				System.out.println("-----------------------------------------------------------------------------------");
				
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
						System.out.println("    "+boardArray[index][0]+"         "+boardArray[index][1]+
							"                      "+boardArray[index][2]+
							"                       "+boardArray[index][3]+"          "+boardArray[index][4]);
						check[index]=1;
					}
					
				}			
				
				
			} else if(selectNo == 2) {
				System.out.print("제목: ");
				String title = scanner.nextLine();
				System.out.print("내용: ");
				String content = scanner.nextLine();
				System.out.print("글쓴이: ");
				String writer = scanner.nextLine();
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {
						count++;
						boardArray[i][0]=String.valueOf(count);
						boardArray[i][1]=title;
						boardArray[i][2]=content;
						boardArray[i][3]=writer;
						boardArray[i][4]="0";
						break;
					}
				}

				System.out.println("-----------------------------------------------------------------------------------");
				System.out.println("   번호        제목                      내용                       글쓴이        조회수");
				System.out.println("-----------------------------------------------------------------------------------");
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
						System.out.println("    "+boardArray[index][0]+"         "+boardArray[index][1]+
							"                      "+boardArray[index][2]+
							"                       "+boardArray[index][3]+"          "+boardArray[index][4]);
						check[index]=1;
					}
					
				}
				

				
			} else if(selectNo == 3) {
				System.out.print("번호: ");
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
					System.out.println("게시물이 존재하지 않습니다.");
				} else {
					System.out.println("제목: " + boardArray[i2][1]);
					System.out.println("내용: " + boardArray[i2][2]);
					System.out.println("글쓴이: " + boardArray[i2][3]);
					hits = Integer.parseInt(boardArray[i2][4]);
					hits++;
					boardArray[i2][4]=String.valueOf(hits);
					System.out.println("조회수: " + boardArray[i2][4]);
				}
				
				
				
			} else if(selectNo == 4) {
				System.out.print("번호: ");
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
					System.out.println("게시물이 존재하지 않습니다.");
				} else {
					System.out.println("기존제목: " + boardArray[i2][1]);
					System.out.print("수정제목: ");
					String title = scanner.nextLine();
					if(!title.equals("")) {
						boardArray[i2][1]=title;
					}
					System.out.println("기존내용: " + boardArray[i2][2]);
					System.out.print("수정내용: ");
					String content = scanner.nextLine();
					if(!content.equals("")) {
						boardArray[i2][2]=content;
					}
	
					System.out.println("-----------------------------------------------------------------------------------");
					System.out.println("   번호        제목                      내용                       글쓴이        조회수");
					System.out.println("-----------------------------------------------------------------------------------");
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
							System.out.println("    "+boardArray[index][0]+"         "+boardArray[index][1]+
								"                      "+boardArray[index][2]+
								"                       "+boardArray[index][3]+"          "+boardArray[index][4]);
							check[index]=1;
						}
						
					}
				}
				

				
				
				
			} else if(selectNo == 5) {
				System.out.print("번호: ");
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
					System.out.println("게시물이 존재하지 않습니다.");
				} else {
					for(int j=0;j<boardArray[i2].length;j++) {
						boardArray[i2][j]=null;
					}
					
					System.out.println("-----------------------------------------------------------------------------------");
					System.out.println("   번호        제목                      내용                       글쓴이        조회수");
					System.out.println("-----------------------------------------------------------------------------------");
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
							System.out.println("    "+boardArray[index][0]+"         "+boardArray[index][1]+
								"                      "+boardArray[index][2]+
								"                       "+boardArray[index][3]+"          "+boardArray[index][4]);
							check[index]=1;
						}
						
					}
				}
				
				
			} else if(selectNo == 6) {
				System.out.println("-----------------------------------------------------------------------------------");
				System.out.println("   번호        제목                      내용                       글쓴이        조회수");
				System.out.println("-----------------------------------------------------------------------------------");
				int[] check = new int[100];
				int topcount = 0;
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
						int num = Integer.parseInt(boardArray[j][4]);
						if(max<=num && check[j]==0) {
							max=num;
							index=j;
						}
					}
					
					if(index!=-1) {
						System.out.println("    "+boardArray[index][0]+"         "+boardArray[index][1]+
							"                      "+boardArray[index][2]+
							"                       "+boardArray[index][3]+"          "+boardArray[index][4]);
						check[index]=1;
						topcount++;
						if(topcount == 5) {
							break;
						}
					}
					
				}
			} else if(selectNo == 7) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("다시 선택해주세요.");
			}
			
			System.out.println();
		}
		
	}

}
