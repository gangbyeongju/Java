package ch06homework.Ex16;

public class Example {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		if(obj1 == obj2) {
			System.out.println("���� ��ü�� ����");
		} else {
			System.out.println("�ٸ� ��ü�� ����");
		}
	}

}
