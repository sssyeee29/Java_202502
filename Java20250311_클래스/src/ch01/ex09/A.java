package ch01.ex09;

public class A {
	private String name;
	

	A(String name) {
		this.name = name;
	}
	void test() {
		System.out.println("A()");
	}
}

class B extends A{
	private String address;
	
	
	B(String name, String address){
		super(name);
		this.address = address;
	}
	@Override // 어노테이션(골뱅이 붙어있는거)
	void test() {
		System.out.println("B()");
	}
}

class C extends B{
	private int age;
	
	
	C(String name, String address, int age){
		super(name, address);
		this.age = age;
	}
	@Override
	void test() { // test부분이 위에 상위클래스랑 다 이름이 같아야한다. 
		System.out.println("C()");
	}
	
}

