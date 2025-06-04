package ex02;

/*
 * 멤버이너클래스(간단하게 이너클래스라고도 함)
 */
class Outer {
	
	private int num=0;  //인스턴스 변수
	
	void func() {};
	
	class Member{
		void add(int n) { num = n; }
		int get() { return num; }
	}
}


public class MemberInnerClass {

	public static void main(String[] args) {
		Outer outer1 = new Outer(); //class Member의 객체를 사용하기 위해서는 
		Outer outer2 = new Outer(); //바깥 클래스인 outer 먼저 객체를 생성해야함 
		
		Outer.Member outer1M1 = outer1.new Member(); //이렇게 해야지 메모리 공간에 올라감
		outer1M1.add(5);
		System.out.println(outer1M1.get());
		
		Outer.Member outer2M2 = outer2.new Member();
		
		outer2M2.add(9);
		System.out.println(outer2M2.get());
		
	}
}
