package ch09.exam03;

public class A {
	public void method(int x) {
		int y = 2;
		//x = 10;
		//y = 20;
		class B {
			public void method() {
				int result = x + y;
			}
		}
	}
}
