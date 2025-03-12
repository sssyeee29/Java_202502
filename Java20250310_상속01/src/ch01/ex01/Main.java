package ch01.ex01;

class K {
	
}
class A{
	String name;
	int age;
	
	A() {}
	
	A(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void run() {
		System.out.println("run()");
	}
	void eat() {
		System.out.println("eat()");
	}
		
}


//B클래스가 상위클래스인 A 클래스를 상속하겠다.
class B extends A{
	String id; 
	
	B() {}
	B(String name, int age, String id) {
		super(name, age); // super 맨 위에 적어줘야함
		this.id = id;
	}
}

class C extends B{ // 앞에 final 붙이면 상속 불가능 
	String pw;
	
	C() {}
	
	C(String name, int age, String id, String pw){
		super(name, age, id);
		this.pw = pw;
		
	}
	
	void displayInfo() {
		System.out.println("A class : " + name);
		System.out.println("A class : " + age);
		System.out.println("B class : " + id);
		System.out.println("C class : " + pw);
	}
}

class D extends C{
	
}
public class Main {

	public static void main(String[] args) {
	
		B b = new B();
		b.eat();
		b.run();
		
		C c = new C("홍길동",20, "test", "1234");
		c.displayInfo();
		
	}

}
