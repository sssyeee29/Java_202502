package ch01.ex09;

public class Main {

	public static void main(String[] args) {

		C c1 = new C("치악산", "강원도", 100); //C클래스 먼저가서 해당되는거 실행하고 상위클래스로 넘어감 
		c1.test();
		
		B b1 = new B("내장산", "전북");
		b1.test();
		
		A a1 = new A("치리산");
		a1.test();
	}

}
