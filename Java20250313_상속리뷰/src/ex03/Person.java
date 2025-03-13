package ex03;

public class Person { // 안써져있지만 object를 상속하고있음 - 자바의 모든 클래스는 object를 상속중 
	private String name;
	private int age;
	
	Person() {}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	void sleep() {
		System.out.println("sleep(...)");
	}
	void eat() {} 
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	void introduce() {
		System.out.println("안녕하세요. 저는 " + name + "이고, 나이는 " + age + " 살입니다.");
	}
 }
