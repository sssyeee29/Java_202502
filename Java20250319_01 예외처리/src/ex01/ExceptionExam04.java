package ex01;

import java.util.Scanner;

public class ExceptionExam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("합 : :" + (num1+num2));
		System.out.println("뺄셈 : :" + (num1-num2));
		System.out.println("곱 : :" + (num1*num2));
		
		int[] arr = new int[10];
		String str = "korea";
		
		try { //예외 발생 소지가 있는것(코드)을 집어넣는다.

			System.out.println("나누기 : :" + (num1/num2));
//			arr[5] = 10;
			System.out.println(str.length());
		
		//예외에 해당되는것들을 catch문에 넣는다. 
		}catch(Exception e) { // Exception은 상위클래스라서 모든 클래스를 참조할 수 있음. 
			System.out.println("예외발생");	//따라서 이거 하나만 작성하면 됨. 
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("프로그램 종료!");
	}

}
