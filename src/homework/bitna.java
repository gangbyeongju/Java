package homework;

import java.util.Scanner;

public class bitna {

	public static void main(String[] args) {
		boolean run  = true;
		int index = 0; //개시물번호
		int count=0; //조회수
		String title;
		String content;
		String writer;
		String[][] boardArray = new String[100][5];
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("1.목록 | 2.생성(Create) | 3.읽기(Read) | 4.수정(Update) | 5.삭제(Delete) | 6.인기글보기(Top5) | 7.종료");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.print("메뉴선택: ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {//목록
					int totalNum = 0; //총갯수
					for(int i=0; i<boardArray.length; i++) {
						if(boardArray[i][0] != null) {
							totalNum++;
						}
					}
				
					System.out.println("------------------------------");
					System.out.println("번호| 제목 | 내용 | 글쓴이 | 조회수       총 갯수: " + totalNum );
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
					int[] check = new int[100]; //출력
					for(int i=0; i<boardArray.length; i++) {
						if(boardArray[i][0]==null) { //nullPointerException 해결 위함
							continue;
						}
						int max = 0;
						int listIndex = -1; 
						for(int j=0; j<boardArray.length; j++) { //게시판번호 max 찾기
							if(boardArray[j][0]==null) {
								continue;
							}
							int num = Integer.parseInt(boardArray[j][0]); //게시판번호
							if(max<=num && check[j]==0) { //[][0]의 최댓값 && 출력안함
								max = num;
								listIndex = j; //게시판번호 제일 큰 배열 인덱스
							}
						}
						
						if(listIndex!=-1) { //게시판번호 제일 큰 배열 출력
						 System.out.print(boardArray[listIndex][0] + "\t");
		                 System.out.print(boardArray[listIndex][1] + "\t");
		                 System.out.print(boardArray[listIndex][2] + "\t");
		                 System.out.print(boardArray[listIndex][3] + "\t");
		                 System.out.println(boardArray[listIndex][4]);
						 check[listIndex]=1; //출력했으면 1 -> 그 다음으로 큰 게시판번호 찾을 수 있음
						}
					}
					*/
				
			}else if(selectNo == 2) {//생성
				index++;
				
				System.out.print("제목: ");
				title = scanner.nextLine();
				System.out.print("내용: ");
				content = scanner.nextLine();
				System.out.print("글쓴이: ");
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
				
				//목록 이동
				int totalNum = 0; //총갯수
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0] != null) {
						totalNum++;
					}
				}
			
				System.out.println("------------------------------");
				System.out.println("번호| 제목 | 내용 | 글쓴이 | 조회수       총 갯수: " + totalNum );
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
				
			}else if(selectNo == 3) {//읽기
				System.out.print("번호: ");
				int readIndex = Integer.parseInt(scanner.nextLine());
				
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0]==null) {
						continue;
					}else if( boardArray[i][0].equals(String.valueOf(readIndex))) {
							count = Integer.parseInt(boardArray[i][4]);
							count++;
							boardArray[i][4] = String.valueOf(count);
							
							System.out.print("제목: ");
							System.out.println(boardArray[i][1]);
							System.out.print("내용: ");
							System.out.println(boardArray[i][2]);
							System.out.print("글쓴이: ");
							System.out.println(boardArray[i][3]);
							System.out.print("조회수: ");
							System.out.println(boardArray[i][4]);
							break;
						}
					
				}
				
			}else if(selectNo == 4) {//수정
				System.out.print("번호: ");
				int updateIndex = Integer.parseInt(scanner.nextLine());
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0]==null) {
						continue;
					}else if( boardArray[i][0].equals(String.valueOf(updateIndex))) {
							
							System.out.println("기존제목: " + boardArray[i][1]);
							System.out.print("수정제목: ");
							boardArray[i][1] = scanner.nextLine();
							System.out.println("기존내용: " + boardArray[i][2]);
							System.out.print("수정내용: ");
							boardArray[i][2] = scanner.nextLine();
							break;
						}
				
				}
				
				//목록이동
				int totalNum = 0; //총갯수
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0] != null) {
						totalNum++;
					}
				}
			
				System.out.println("------------------------------");
				System.out.println("번호| 제목 | 내용 | 글쓴이 | 조회수       총 갯수: " + totalNum );
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
				
			}else if(selectNo == 5) {//삭제
				System.out.print("번호: ");
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
				
				//목록이동
				int totalNum = 0; //총갯수
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0] != null) {
						totalNum++;
					}
				}
			
				System.out.println("------------------------------");
				System.out.println("번호| 제목 | 내용 | 글쓴이 | 조회수       총 갯수: " + totalNum );
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
				
				
			}else if(selectNo == 6) {//인기글 보기
				System.out.println("------------------------------");
				System.out.println("         인기글 Top5           ");
				System.out.println("조회수 | 번호 | 제목 | 내용 | 글쓴이 ");
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
			
				
			}else if(selectNo == 7) {//종료
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");
	}

}
