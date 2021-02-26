package ch15.exam02;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List<Board> list = new ArrayList<>();
		
		//按眉 历厘
		list.add(new Board(1, "力格1"));
		list.add(new Board(2, "力格2"));  //AutoBoxing
		list.add(new Board(3, "力格3"));
		System.out.println(list.size());
		
		//按眉 掘扁
		Board board1 = list.get(0);
		System.out.println(board1.getBno() + ":" + board1.getTitle());
		Board board2 = list.get(1);
		Board board3 = list.get(2);
		
		//馆汗贸府
		for(int i=0;i<list.size();i++) {
			Board board = list.get(i);
			System.out.println(board.getBno() + ":" + board.getTitle());
		}
		
		for(Board board : list) {
			System.out.println(board.getBno() + ":" + board.getTitle());
		}
		
		//按眉 力芭
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());

	}

}
