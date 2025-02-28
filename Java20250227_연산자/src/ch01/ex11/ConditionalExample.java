package ch01.ex11;

import java.util.Scanner;

public class ConditionalExample {

	public static void main(String[] args) {
		// 삼항 연산자(조건 연산자)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력:");
		
		int number = sc.nextInt();   // 정수값만 입력받을거
		
		// String result = (number > 0) ? "양수입력함"  :  "음수입력함";
					// ex 만약에 -9면 -9>0 거짓이니까 :(콜론) 뒤에 있는 음수입력함 이게 작동함
		//절대값으로 출력
		int result = (number > 0) ? number : -number;
		// -5를 넣으면 거짓이니까 :(콜론) 뒤에 있는것이 작동하는데 -가 붙어있으니까절대값으로 나옴
		System.out.println(result);
		
		
	}

}
