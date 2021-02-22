package ch04;

public class Exam12 {

	public static void main(String[] args) {
		
		int count = 0;
		while(true) {
			count++;
			if(count%2==0) {
				continue;
			}
			System.out.println(count);
			if(count>10) {
				break;
				//return;
			}
		}
		System.out.println("프로그램 마무리 내용 실행");
		
	}

}
