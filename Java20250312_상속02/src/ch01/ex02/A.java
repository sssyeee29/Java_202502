package ch01.ex02;

public class A {
	private String name; 
	
	A(String name) {
		this.name = name;
	}
	A() {}
	void test() { 
		System.out.println("A class");
	}
	void funcA() {
		System.out.println("funcA()");
	}
}
	
class B extends A {
	private String address;
	
	B() {}
	B(String name, String address) {
		super(name);
		this.address = address;
	}
	
	@Override
	void test() { // 메서드 오버라이딩 - 상위클래스에 있는거 똑같이 쓰는거 
		System.out.println("B class");
	}
	
	void funcB() {
		System.out.println("funcB()");
	}
}

class C extends B {
	private int age;
	
	C(){}
	C(String name, String address, int age) { // 위에 있는 name, address, age랑 다른변수
		super(name, address);
		this.age = age;
	}
	
	@Override
	void test() {
		System.out.println("C class");
	}
	void funcC() {
		System.out.println("funcC()");
	}
	
	
}