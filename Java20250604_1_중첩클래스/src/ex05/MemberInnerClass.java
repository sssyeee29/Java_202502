package ex05;

/*
 * 멤버이너클래스 생성
 */
interface Printable{
	void print();
}

class Papers{
	
	private String message;
	
	public Papers(String message) { 
		this.message = message; // 출력메시지
	}
	
	public Printable getPrinter() {   //반환타입 : Printable -> Printable구현한 클래스만 반환한다.
		return new Printer(); //메모리 공간에 printer 객체 생
	}
	
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

