package ch06.exam02;

public class Example {

	public static void main(String[] args) {
		
		//��ü ����
		Car mycar = new Car();
		
		//�ʵ��� ���� �б�
		System.out.println(mycar.company);
		System.out.println(mycar.model);
		System.out.println(mycar.price);
		System.out.println(mycar.old);
		System.out.println(mycar.speed);
		
		//�ʵ��� ���� ����
		mycar.company = "�����ڵ���";
		mycar.model = "�׷���";
		mycar.price = 30000000;
		mycar.old = true;
		mycar.speed = 60;
		
		//�ʵ��� ���� �б�
		System.out.println(mycar.company);
		System.out.println(mycar.model);
		System.out.println(mycar.price);
		System.out.println(mycar.old);
		System.out.println(mycar.speed);
		
		//�ٸ� ��ü ����
		Car yourcar = new Car();
		
		
	}

}
