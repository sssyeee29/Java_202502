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
public class 함수매개변수없고변환값없는경우01 {

	public static void main(String[] args) {
		sum(); // 함수 호출 - 진입저(반드시 있어야함) // 이걸입력하면 아래 있는 25번 sum으로 가서 실행 후 
											// 밑에있는 중괄호 만나면 원래 자기 문장으로 돌아가 이어서 실행
		System.out.println("프로그램 종료!!");
		
	}
	
	//함수 정의 // 반드시 이 위치에서 시작해야함 
	public static void sum() { // sum() 괄호가 비어있으면 값 전달이 없는것
		//코드 구현
		System.out.println("void sum() 함수 호출!!");
	}
}

