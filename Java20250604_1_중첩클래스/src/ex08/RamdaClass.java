package ex08;

import java.util.function.Function;

/*
 * 멤버로컬클래스 생성
 */
@FunctionalInterface //이게 붙은 인터페이스 안에는 추상메소드가 하나만 존재한다는 뜻 
					// 이게 붙어있으면 컴파일러가 '진짜 한개만 존재하는지' 검사해줌
interface Printable{ //인터페이스 안에 추상메소드가 한개만 존재해야 람다식으로 만들 수 있음 (함수형 인터페이스)
	void print();	// 람다식은 '하나의 기능을 전달'하는 것. 
}


class Papers{
	
	private String message;
	public Papers(String message) { 
		this.message = message; }
	
	public Printable getPrinter() {   //반환타입 : Printable -> Printable구현한 클래스만 반환한다.
		
		/*
		return new Printable(){  //익명 클래스
			@Override
			public void print() {
				System.out.println(message);
			} 
		}; */ 
		
		//람다식 : Printable안에 메소드가 1개만 존재해야함 
		// 구현해야할 객체의 메소드가 한개여야함
		return  () -> System.out.println(message);
	}
}


public class RamdaClass {

	public static void main(String[] args) {
		
		Papers papers = new Papers("이 문장을 출력해주세요");
		
		Printable p = papers.getPrinter();
		p.print();
	}
}

