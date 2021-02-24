package ch09.exam02;

public class A {
	public class B {
		public int field1;
		public B() {}
		public void method() {}
	}
	
	public static class C {
		public int field1;
		public C() {}
		public void method() {}
	}
	
	public void method() {
		class D {
			public int field1;
			public D() {}
			public void method() {}
		}
		
		D d = new D();
		d.field1 = 1;
		d.method();
	}
}
