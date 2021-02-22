package ch04;

public class Exam04 {

	public static void main(String[] args) {
		
		char grade = 'D';
		
		switch(grade) {
			case 'A':
				System.out.println("커피를 대접합니다.");
				//break;
			case 'B':
				System.out.println("사탕을 줍니다.");
				break;
			case 'C':
				System.out.println("인사만 합니다.");
				break;
			default:
				System.out.println("신경쓰지 않습니다.");
		}
		
		if(grade=='A') {
			System.out.println("커피를 대접합니다.");
			System.out.println("사탕을 줍니다.");
		} else if(grade=='B') {
			System.out.println("사탕을 줍니다.");
		} else if(grade=='C') {
			System.out.println("인사만 합니다.");
		} else {
			System.out.println("신경쓰지 않습니다.");
		}
	}

}
