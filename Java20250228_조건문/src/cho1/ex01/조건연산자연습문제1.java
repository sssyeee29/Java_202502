package cho1.ex01;

import java.util.Scanner;

public class 조건연산자연습문제1 {

	public static void main(String[] args) {

		/*
		 * 키보드 통해서 국어점수 입력 받는다.
		 * 70이상이면 합격이 출력되고, 70미만이면 불합격 메세지 출력
		 */
		
		Scanner sc = new Scanner(System.in); // 빨간줄 들어오는거면 3번에 저게 안적혀 있다는 것 
											//	빨간줄 누르면 뭐가 틀렸는지 알려줌 
		
		System.out.println("국어점수:");
		
		int number = sc.nextInt();
		// int korScore = 이렇게 써도 됨
		String result = (number >= 70) ? "합격" : "불합격";
		
		System.out.println(result);
		
	/*
	 * Scanner sc = new Scanner(System.in);
	 * System.out.printIn("점수 입력 : ");
	 * int korScore = sc.nextInt();
	 * String result = (korScore >= 70) ? "합격" : "불합격";
	 * System.out.printIn(result);
	 * 
	 * 	
	 */
		
		
		
		
	}

}
