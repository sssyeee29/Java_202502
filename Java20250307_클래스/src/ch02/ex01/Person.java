package ch02.ex01;

public class Person {

	/* 멤버변수 -> 값 세팅하는 방법(2가지)
	 * 1. 생성자
	 * 2. setter : 변수값을 저장
	 * 3. getter : 변수값을 읽어옴
	 */
	
	private String name; 
	private int age;
	private String phone;
	
	// 생성자
	public Person() {
		System.out.println("Person()");
	}
	
	//생성자
	public Person(String n) {
		System.out.println("Person(String n)");
		name = n;
	}
	
	//생성자
	public Person(String n, int a, String p) {
		System.out.println("Person(String n, int a, String p)");
		name = n;
		age = a;
		phone = p;
	}
	
	void setName(String n) { // setter는 바꿀 값 앞에 set붙이고 카멜표기법으로 적어줌
		name = n;
	}
	
	void setAge(int a) {
		age = a;
	}
	
	String getName() { //getter를 이용해서 값을 읽어옴, 값을 불러오는거니까 반드시 return을 써줘야함 
		return name; 
	}
	
	int getAge() {
		return age;
	}
	private void run() {
		System.out.println(name + " 달리다!");
	}
	
	void sleep() {
		System.out.println(name + " 자다!");
	}
	
	void eat() {
		run();
		System.out.println(name + " 먹다!");
	}
}
