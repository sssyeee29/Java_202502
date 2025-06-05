package ex05;

/*
 * 멤버이너클래스 생성
 * Printable : 출력 기능을 위한 역할(인터페이스), print() 메소드만 정의됨 
 * Papers : 문서(텍스트 데이터)보관, 내부에 출력용 이너클래스 Printer 포함
 * Printer : Papers 내부 클래스, Printable 구현체, print()를 실제 구현
 * MemberInnerClass : 실행용 main 클래스, 프로그램 시작점 
 */

interface Printable{
	void print(); //인터페이스 -> 기능의 약속 
}

class Papers{
	
	private String message;
	
	public Papers(String message) { 
		this.message = message; // 출력메시지
	}
	
	/*외부에서 Printer를 직접 생성하지 못하게 숨기고, 오직 getPrinter()라는 메소드를 통해서만
	  출력기능객체를 만들 수 있도록 하기 위해서 //캡슐화 + 은닉 + 객체 생성 책임을 Papers에 몰아주는 패턴.. 
	  **자바가 내부 클래스를 컴파일할 때, 바깥 클래스의 모든 내용(속성, 내부클래스 등)을 미리 인식하기 때문에 
	  	클래스보다 객체를 먼저 만드는것이 가능하다 ~!
	*/
	public Printable getPrinter() {   //반환타입 : Printable -> Printable구현한 클래스만 반환한다.
		return new Printer(); //메모리 공간에 printer 객체 생성
	}						/*getPrinter() 메서드는 Papers의 외부 사용자들이 Printer라는 내부 구조를 몰라도
							출력 기능(Printable) 을 쓸 수 있게 도와주는 역할이야.*/
							/*외부에서 사용할 객체 생성을 바깥 클래스 (Papers)가 담당하면
							내부 구현을 감추면서도 필요한 기능을 외부에 제공할 수 있어서 구조적으로 좋아.*/
	
	class Printer implements Printable{  //멤버이너클래스
		@Override
		public void print() {
			System.out.println(message);
		}
	}
} 


public class MemberInnerClass {

	public static void main(String[] args) {
		
		Papers papers = new Papers("이 문장을 출력해주세요");
		
		Printable p = papers.getPrinter();
		p.print();
		
	}
	
	
}

