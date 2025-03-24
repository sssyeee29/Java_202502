package ex10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override // 이름이랑 나이를 같이 출력해주지만 22번에서 나이로 재정의 한다고 해서 
				// 나이순으로 출력되는 것 
	public String toString() {
		return name + " & " + age;
	}
	
	@Override //적절하게 재정의 해줘야함 // 이건 나이 정렬 
	public int compareTo(Person o) {
		return Integer.compare(this.age, o.age);
	}
	
//	이름으로 정렬 **근데 이름만 정의하는건 안돼서 이름과 나이를 둘다 만족하는 재정의를 해줘야함 
//	@Override //적절하게 재정의 해줘야함 // 이건 나이 정렬
//	public int compareTo(Person o) {
//		return this.name.compareTo(o.name);
//	}
	
	
}
public class SetExam03 {
	
	public static void main(String[] args) {

		Set<Person> p = new TreeSet<Person> ();
		
		p.add(new Person("AAA", 20));
		p.add(new Person("BBB", 10));
		p.add(new Person("AAA", 20));
		p.add(new Person("BBB", 10));
		p.add(new Person("DDD", 30));
		p.add(new Person("FFF", 60));
		p.add(new Person("GGG", 45));
		
		Iterator<Person> itr = p.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
