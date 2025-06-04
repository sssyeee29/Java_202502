package ex01;

import java.util.Random;

class Outer {
	private static int num;
	
	private int age=10;
	
	static class Nested1{  //정적 중첩 클래스 : 클래스 안에 있는 클래스에 static 붙은거 
		void add(int n) { 
			num += n; //static이 붙은 num만 접근 가능(객체 생성전에 이미 메모리공간에 올라가서)
			//age++; 
		}
	}
	
	static class Nested2{
		int get() { 
			return num; }
	}
	
	int getAge() { 
		return num;}
}

public class StaticNested {

	public static void main(String[] args) {
		
		Outer.Nested1 nested1 = new Outer.Nested1(); 
		
		nested1.add(50);
		
		Outer.Nested2 nested2 = new Outer.Nested2();
		System.out.println(nested2.get());
		
	}

}
