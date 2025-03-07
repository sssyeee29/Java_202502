package ch02.ex03;

	/*
	 * 1. name(이름), age(나이)를 필드로 가짐
	 * 2. 생성자를 통해 name과 age를 설정할 수 있음
	 * 3. introduce() 메서드를 구현하여 
	   "안녕하세요, 제이름은 [name]이고, [age]살입니다."라는 문자열을 반환하도록 함
	 * 4. main 메서드에서 Person 객체를 생성하고 introduce()를 호출하여 결과를 출력
	 */
public class Person {

/*	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		
		String msg = p.introduce();
		System.out.println(msg);
	}
	*/
	
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person()");
	}
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
		
	String introduce() {
		return "안녕하세요, 제이름은 [" + name + "]이고, [" + age + "]살입니다.";

	}
	
}
