package ch01.ex04;

/*
 * setter, getter
 */
public class Person {

	private String name;
	private int age;
	
	String getName(){
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	void setName(String name) { // 반환타입 없으니까 void
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	public Person() { 
		this("남산", 1);
	}
	
	public Person(String name) { 
		this(name, 1);
	}
	
	public Person(String name, int age) {  
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
