package ex08;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Num{
	private int num;
	
	public Num(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return num + "";
	}
	
	@Override
	public int hashCode() {
//		System.out.println("-hashCode-");
		return Objects.hash(num);
	}
	
	@Override
	public boolean equals(Object obj) {
//		System.out.println("-equals-");
		
		Num number = (Num)obj;
		
		return this.num == number.num;
	}
}
public class SetExam02 {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>(); //무조건 정렬해야함 
		// 문자는 아스키코드표를 기준으로 정렬된다. (알파벳순으로 정리함)
		set.add("Toy");
		set.add("toy");
		set.add("Box");
		set.add("box");
		set.add("Robot");
		set.add("안녕");
		set.add("Toy");
		
		//정렬 조건이 없기 때문에 실행불가 
//		set.add(new Num(1234));
//		set.add(new Num(1357));
//		set.add(new Num(1395));
//		set.add(new Num(1234));
//		set.add(new Num(1357));
//		
		for(String n : set)
			System.out.println(n);
		
		System.out.println();
		Set<Integer> iset = new TreeSet<>();
		// 동일한 숫자는 들어가지 않음 
		iset.add(40);
		iset.add(30);
		iset.add(50);
		iset.add(10);
		iset.add(20);
		iset.add(40);
		iset.add(30);
		
		for(int n : iset)
			System.out.println(n);
	}

}
