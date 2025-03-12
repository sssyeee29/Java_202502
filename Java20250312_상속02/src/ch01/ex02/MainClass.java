package ch01.ex02;

/*
 *  <상속 전제 조건>
 *  하위클래스는 상위클래스 자원 접근 가능(private 제외)
 *  상위클래스는 하위클래스 접근 불가 
 */

public class MainClass {

	public static void main(String[] args) {
		
		A a1 = new A();
		a1.test();
		
		B b1 = new B();
		b1.test();
		
		C c1 = new C();
		c1.test();
		
		System.out.println("-------다형성------");
		
		A a2 = new C(); // 오버라이딩을 하면 예외사항으로 하위클래스의 자원에 접근이 가능해짐 (여기서는 test가 오버라이딩됐으니)
		a2.test(); // why C꺼가나오는가 : 오버라이딩했다는 가정하에 참조하고 있는게 C니까 C가 출력됨
					//오버라이딩을 하면 타입이 중요한게 아니라 무엇을 참조하고 있는지를 봐야 결과를 알 수 있음 
		A a3 = new B();
		a3.test(); 
		
		B b2 = new C();
		b2.test();
		
		B b3 = new C();
		b2.test();
	}

}
