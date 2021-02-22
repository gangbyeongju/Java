package ch06.exam08;

public class BoardService {
	//Field
	String[][] boards;
	int count;
	
	//Constructor
	BoardService(int rows, int columns) {
		boards = new String[rows][columns];
	}
	
	//Method
	int getNewBno() {
		return ++count;
	}
	
	void create(String title, String content, String writer, int hitcount) {
		String[] board = {
				String.valueOf(getNewBno()),
				title,
				content,
				writer,
				String.valueOf(hitcount)
		};
		for(int i=0;i<boards.length;i++) {
			if(boards[i][0] == null) {
				boards[i] = board;
				break;
			}
		}
	}
	
	void showList() {
		for(int i=0; i<boards.length; i++) {
			for(int k=0; k<boards[i].length; k++) {
				System.out.print(boards[i][k] + "\t");
			}
			System.out.println();
		}
	}
	
	String[] read(int bno) {
		String[] result = null;
		String strBno = String.valueOf(bno);
		for(int i=0; i<boards.length; i++) {
			if(boards[i][0] != null) {
				if(boards[i][0].equals(strBno)) {
					result = boards[i];
					break;
				}
			}
		}
		return result;
	}
	
}
