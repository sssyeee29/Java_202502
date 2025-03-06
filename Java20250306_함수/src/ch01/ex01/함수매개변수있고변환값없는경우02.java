package ch01.ex01;

/*
 ********* 함수 *********
 * 입력(매개변수)    출력(반환값)
 *  O				O ->03클래스
 *  O				X ->02클래스
 *  X				O ->04클래스
 *  X				X ->01클래스
 *  
 *  함수 정의 -> 함수 만드는 것
 *  함수 호출 -> 만든 함수를 실행하는것
 *  
 */
public class 함수매개변수있고변환값없는경우02 {

	public static void main(String[] args) {
		sum(10, 20); // 함수 호출 // 100은 인자값 // 인자값이 2개면 매개변수도 두개여야함, 타입도 일치해야함
		System.out.println("프로그램 종료!!");
		
	}
	
	//함수 정의 // void는 반환값이 없다는 뜻
	public static void sum(int n1, int n2) { //int num에 100이 입력됨, int num이 매개변수
		//코드 구현
		System.out.println("void sum() 함수 호출!!");
		System.out.println(n1+n2);
	}
}

