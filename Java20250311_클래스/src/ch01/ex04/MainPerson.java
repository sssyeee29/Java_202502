package ch01.ex04;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("설악산", 50);
		Person p2 = new Person("지리산", 30);
		
		System.out.println(p1.displayInfo()); // 이거대신 10번꺼 써도 됨 
		
		p1.setName("내장산");
		p1.setAge(111);
		
		System.out.println(p1.displayInfo()); 
		System.out.println(p1.getName()); 
		System.out.println(p1.getAge()); 
	}

}
