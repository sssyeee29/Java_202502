package ch01.ex08;

public class A {
	private String name;
	private int age;
	
	A(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	A(){}
	void funcA() {
		System.out.println("funcA()");
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age);
	}
}

class B extends A {
	private String address;
	
	B() {}
	
	B(String name, int age, String address){
		super(name, age); // 상위 클래스 생성자 호출
		this.address = address;
	}
	
	//상위클래스가 가지고 있는 메소드 ==> 재정의, 오버라이딩
	@Override // 상위클래스에 있는 메소드를 재정의 하고있다.
	void info() {
		System.out.println("B class"); // 
	}
	void infoB() {
		info();
		System.out.println();
	}
	void funcB() {
		System.out.println("FuncB()");
	}
}