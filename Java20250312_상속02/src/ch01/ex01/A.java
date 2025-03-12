package ch01.ex01;

public class A {
	private String name; 
	
	A(String name) {
		this.name = name;
	}
	A() {}
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
	void funcC() {
		System.out.println("funcC()");
	}
	
	
}