package ch01.ex01;

/*
 ********* 함수 *********
 * 입력(매개변수)    출력(반환값)
 *  O				O
 *  O				X
 *  X				O
 *  X				X
 *  
 *  함수 정의 -> 함수 만드는 것
 *  함수 호출 -> 만든 함수를 실행하는것
 *  
 */
public class 함수매개변수있고변환값있는경우03 {

	public static void main(String[] args) {
		int result = sum(10, 20);// 이 코드 실행하면 결과는
		// int result = 30;      --> 이렇게 나온다.
		System.out.println(result);
		System.out.println("프로그램 종료!!");
		
	}
	
	//함수 정의 
	public static int sum(int n1, int n2) { //24번, 28번 타입이 같아야함 
											//반환시키려면 30번 리턴문장 반드시 기입을 해야함
		//코드 구현
		System.out.println("void sum(int n1, int n2) 함수 호출!!");
		
		return n1+n2; // return 값을 반환한다.(n1+n2 => 정수값) // 리턴값 전달은 only 1개만 가능.
	}
}

