package ex01;

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	@Override
	public int hashCode() {
		System.out.println("--------hashCode----------");
		int result = name != null ? name.hashCode():0; // hashcode에 null이 아니면 0을 넣어라 
		
		//자바에서는 객체 해시를 생성할 때 필드들의 해시를 혼합할 목적으로 주로 31 소수값을 곱해줌
		result = 31 * result + age;
		
		return result;
	}
	
	//System.out.println(p1.equals(p4));
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("--------equals----------");
		Person o = (Person)obj; 
		
		return this.age == o.age && this.name == o.name; //비교하고 싶은 항목만 쓰면 됨 
	}
	
}

public class PersonTest {

	public static void main(String[] args) {
		
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		
		System.out.println(str1.equals(str2)); // true
		
		Person p1 = new Person("홍길동", 10);
		Person p2 = new Person("홍길동", 20);
		
		System.out.println(p1.equals(p2)); // false
		
		Person p3 = new Person("홍길동", 10);
		Person p4 = new Person("홍길동", 10);
		
		System.out.println(p1.equals(p4)); // false
		
	}

}
