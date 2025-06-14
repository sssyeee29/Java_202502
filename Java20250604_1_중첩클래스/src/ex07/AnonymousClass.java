package ex07;

/*
 * 멤버로컬클래스 생성
 */
interface Printable{
	void print();
//	void print2();
}


class Papers{
	
	private String message;
	
	public Papers(String message) { 
		this.message = message; }
	
	public Printable getPrinter() {   //반환타입 : Printable -> Printable구현한 클래스만 반환한다.
										//getPrinter는 객체를 만들어서 리턴하는 그런 의미 
										//getPrinter() 메소드는 Printable 타입 객체를 돌려준다는 뜻 
		return new Printable() {//익명클래스 : 이름이 없음.
			
			@Override
			public void print() { 
				System.out.println(message);
				
			}
		};
			
		
	}
}


public class AnonymousClass {

	public static void main(String[] args) {
		
		Papers papers = new Papers("이 문장을 출력해주세요");
		
		Printable p = papers.getPrinter();
		p.print();
		
	}
}

