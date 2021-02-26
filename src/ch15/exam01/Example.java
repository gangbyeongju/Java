package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		//按眉 历厘
		list.add("全辨悼");
		list.add(3);  //AutoBoxing
		list.add(new Board());
		System.out.println(list.size());
		
		//按眉 掘扁
		String name = (String) list.get(0);
		int value = (Integer) list.get(1);
		Board board = (Board) list.get(2);
		
		//按眉 力芭
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());

	}

}
