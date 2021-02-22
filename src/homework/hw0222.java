package homework;

import java.util.Scanner;

public class hw0222 {

	public static void main(String[] args) {
		
		String[][] boardArray = new String[100][5];
		
		Scanner scanner = new Scanner(System.in);
		int count=0; // 게시물 번호
		
		while(true) {
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("1. 목록 | 2. 생성(Create) | 3. 읽기(Read) | 4. 수정(Update) | 5. 삭제(Delete) | 6. 인기글 TOP5 |  7. 종료");
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.print("메뉴선택: ");
			
			String selectNo = scanner.nextLine();
			
			
			if(selectNo.equals("1")) {

				// 변경 -> 조회수 반영 목록
				// 조회수 세기 로직
				int boardCount = 0 ;
				for(int i=0; i < boardArray.length; i++) {
					if(boardArray[i][0] != null) {
						boardCount++;
					}
					
				}
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("총 게시물 수 : " + boardCount);
				System.out.println("------------------------------------------------------------------------------------------------");
				
				System.out.print("번호" + "\t");
				System.out.print("제목" + "\t\t\t\t" );
				System.out.print("내용" + "\t\t\t\t");
				System.out.print("글쓴이" + "\t\t");
				System.out.print("조회수" + "\t\n");
				System.out.println("------------------------------------------------------------------------------------------------");
				
				int[] check = new int[100]; // 출력한 게시물인지 아닌지 check하는 배열 
				for(int i=0;i<boardArray.length;i++) { // 게시물을 출력할 for 문
					if(boardArray[i][0]==null) { // 게시물이 null인 경우
						continue;
					}
					int max = 0; //가장 큰 게시판 번호 초기값 0
					int index = -1;   //게시판 번호가 가장 클 때의 배열 인덱스
					for(int j=0;j<boardArray.length;j++) {//가장 큰 게시판 번호를 찾기 위한 for문
						if(boardArray[j][0]==null) { // 게시물이 null인 경우
							continue;
						}
						int num = Integer.parseInt(boardArray[j][0]); // 현재 게시판 번호
						if(max<=num && check[j]==0) { //게시판 번호가 가장 큰 값이면서 출력하지 않은 게시물이면
							max=num; //게시판 번호를 max에 저장
							index=j; //게시판 번호가 가장 큰 배열 인덱스 
						}
					}
					
					if(index!=-1) { //출력할 게시물이 있는가? 
						System.out.print(boardArray[index][0] + "\t");
						System.out.print(boardArray[index][1] + "\t\t\t\t" );
						System.out.print(boardArray[index][2] + "\t\t\t\t");
						System.out.print(boardArray[index][3] + "\t\t");
						System.out.print(boardArray[index][4] + "\t\n");
						check[index]=1; //출력한 게시물 체크
					}
					
				}			
				
				
			} else if(selectNo.equals("2")) {
				System.out.print("제목: ");
				String title = scanner.nextLine();
				System.out.print("내용: ");
				String content = scanner.nextLine();
				System.out.print("글쓴이: ");
				String writer = scanner.nextLine();
				
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {
						count++; // 저장할 때 카운트 저장 (게시물 번호)
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
					
				// 변경 -> 조회수 반영 목록
				// 조회수 세기 로직
				int boardCount = 0 ;
				for(int i=0; i < boardArray.length; i++) {
					if(boardArray[i][0] != null) {
						boardCount++;
					}
					
				}
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("총 게시물 수 : " + boardCount);
				System.out.println("------------------------------------------------------------------------------------------------");
				
				System.out.print("번호" + "\t");
				System.out.print("제목" + "\t\t\t\t" );
				System.out.print("내용" + "\t\t\t\t");
				System.out.print("글쓴이" + "\t\t");
				System.out.print("조회수" + "\t\n");
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
				System.out.print("번호: ");
				String number = scanner.nextLine();
				int i2 = -1; // 게시물이 있는지 없는지 체크
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
				
				
				
			} else if(selectNo.equals("4")) {
				System.out.print("번호: ");
				String number = scanner.nextLine();
				int i2 = -1; // 게시물이 있는지 없는지 체크
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
					
					// 변경 -> 조회수 반영 목록
					// 조회수 세기 로직
					int boardCount = 0 ;
					for(int i=0; i < boardArray.length; i++) {
						if(boardArray[i][0] != null) {
							boardCount++;
						}
						
					}
					System.out.println("------------------------------------------------------------------------------------------------");
					System.out.println("총 게시물 수 : " + boardCount);
					System.out.println("------------------------------------------------------------------------------------------------");
					
					System.out.print("번호" + "\t");
					System.out.print("제목" + "\t\t\t\t" );
					System.out.print("내용" + "\t\t\t\t");
					System.out.print("글쓴이" + "\t\t");
					System.out.print("조회수" + "\t\n");
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
					
					// 변경 -> 조회수 반영 목록
					// 조회수 세기 로직
					int boardCount = 0 ;
					for(int i=0; i < boardArray.length; i++) {
						if(boardArray[i][0] != null) {
							boardCount++;
						}
						
					}
					System.out.println("------------------------------------------------------------------------------------------------");
					System.out.println("총 게시물 수 : " + boardCount);
					System.out.println("------------------------------------------------------------------------------------------------");
					
					System.out.print("번호" + "\t");
					System.out.print("제목" + "\t\t\t\t" );
					System.out.print("내용" + "\t\t\t\t");
					System.out.print("글쓴이" + "\t\t");
					System.out.print("조회수" + "\t\n");
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
				int topCount = 1; // 5개만 출력하기 위한 변수
				int[] check = new int[100];
				System.out.println("------------------------------------------------------------------------------------------------------");
				System.out.print("순위" + "\t");
				System.out.print("번호" + "\t");
				System.out.print("제목" + "\t\t\t\t" );
				System.out.print("내용" + "\t\t\t\t");
				System.out.print("글쓴이" + "\t\t");
				System.out.print("조회수" + "\t\n");
				System.out.println("------------------------------------------------------------------------------------------------------");
				
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {
						continue;
					} else {
						if (topCount > 5) { // 인기글 5개를 넘어가면? 나간다
							break;
						} else {
							int max = 0;
							int index = -1;
							for(int j=0;j<boardArray.length;j++) {
								if(boardArray[j][4]==null) { //  조회수가 null이면 넘어가기
									continue;
								}
								int num = Integer.parseInt(boardArray[j][4]);
								if(max<=num && check[j]==0) { // 최대값 비교
									max=num;
									index=j;
								}
							}
							
							if(index!=-1) { // 출력할 게시물이 있는가?
								if(boardArray[index][4].equals("0")) { // 게시물의 조회수가 0이라면 보여주지 않는다
									break;
								} else {
									System.out.print(topCount + "위\t");
									System.out.print(boardArray[index][0] + "\t");
									System.out.print(boardArray[index][1] + "\t\t\t\t" );
									System.out.print(boardArray[index][2] + "\t\t\t\t");
									System.out.print(boardArray[index][3] + "\t\t");
									System.out.print(boardArray[index][4] + "\t\n");
									check[index]=1; // 출력한 게시물 체크
									topCount++; // 인기글 추가
								}
								
							}
							
						}
					}
				
				}	

			} else if(selectNo.equals("7")) {
				System.out.println("프로그램 종료");
				break;
				
			} else {
				System.out.println("다시 선택해주세요.");
			}
			
			System.out.println();
		}

	}

}
