package ex07;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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
		
		Set<Num> set = new HashSet<Num>();
		
		set.add(new Num(1234));
		set.add(new Num(1357));
		set.add(new Num(1395));
		set.add(new Num(1234));
		set.add(new Num(1357));
		
		for(Num n : set)
			System.out.println(n);
	}

}
