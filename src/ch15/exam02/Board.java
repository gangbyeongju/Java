package ch15.exam02;

public class Board {
	private int bno;
	private String title;
	
	public Board(int bno, String title) {
		this.bno = bno;
		this.title = title;
	}
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
