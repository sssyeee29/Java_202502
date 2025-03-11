package ch01.ex03;

/*
 * 사람 클래스
 * 사람 특징 - name, age, height, weight, ....
 * 사람 동작 - run, sleep, eat, study, work, ....
 * 
 * 
 * 간추려 내는 과정을 추상화
 */
public class Person {

	private String name;
	private int age;
	
	public Person() { 
		this("남산", 1);
//		name = "남산";
//		age = 1;
	}
	
	public Person(String name) { 
		this(name, 1);
//		this.name  = name;
//		age = 1;
	}
	
	public Person(String name, int age) { //기본생성자
		this.name = name; //this 안붙이면 값이 출력이 안됨 
		this.age = age;
		
	}
	
	String displayInfo() {
		return name + " : " + age;
		
	}
	
	void run() {
		System.out.println("run.......");
	}
	
	void eat() {
		System.out.println("eat.......");
		
	}
}
