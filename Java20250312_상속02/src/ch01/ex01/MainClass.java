package ch01.ex01;

/*
 *  <상속 전제 조건>
 *  하위클래스는 상위클래스 자원 접근 가능(private 제외)
 *  상위클래스는 하위클래스 접근 불가 
 */

public class MainClass {

	public static void main(String[] args) {
		
		C c1 = new C("지리산", "전북 남원", 40);
		c1.funcA();
		c1.funcB();
		c1.funcC();
		
		B  b1 = new B("남산", "서울");
		b1.funcA();
		b1.funcB();
		
		A a1 = new A("내장산");
		a1.funcA();
		System.out.println("-----자동타입변환-----");
		
		/*
		 * 상위클래스는 하위클래스를 참조할 수 있다.
		 * 단. 하위클래스 자원에는 접근 불가.
		 * 자신 클래스에만 접근 가능
		 */
//		B a2 = new B("치악산", "원주");
//		A a2 = (A)b2;
		
		A a2 = new B("치악산", "원주");
		a2.funcA();
		//a2.funcB();
		
		A a3 = new C("한라산", "제주",31);
		
		System.out.println("-----강제타입변환-----");
		
		/* 강제타입변환 불가능
		A a5 = new A();
		B b3 = new B();
		b3 = (B)a5; // 이렇게 적어도 실행하면 오류가 생김
		b3.funcA(); // 강제타입변환이 안됨. why? 참조범위가 적어져서 
		*/

		//강제타입변환 가능 
		A a6 = new B();
		B b4 = new B();
		b4 = (B)a6;
		
		//강제타입변환 가능 
		A a7 = new C();
		B b5;
		b5 = (B)a7;
		b5.funcB();
		b5.funcA();
		
		//강제타입변환 가능 
		A a8 = new C();
		C c2 ;
		c2 =(C)a8;
		
		//강제타입변환 가능 
		A a10 = new A();
		B b6 = new B();
		a10 = b6;
		B b7 = (B)a10; // a10이 b6을 참조하는걸로 바껴서 강제타입변환 가능해짐 
		b7.funcA();
		b7.funcB();
		
		A a4 = new B("백두산", "함경북도");
		B b2 = new B("백두산", "함경북도");
		
	}

}
