package ex01;

import java.util.Scanner;

public class ExceptionExam05 {

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
		
		try { 

			System.out.println("나누기 : :" + (num1/num2));
//			arr[5] = 10;
			System.out.println(str.length());
		
		}catch(ArithmeticException e) { // e참조변수는 아무거나 넣어줘도 되지만 일반적으로 exception의 맨 앞글자 e를 쓰는게 일반적 
			System.out.println("0으로 나눌 때 발생");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 공간 부족");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("참조 값이 없다.");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(Exception e) { // Exception이 다 처리해주니까 다른 예외애들이 오류나니까 같이 쓰려면 제일 하단에 써주기
			e.printStackTrace();	// (상위클래스라서)
		}finally { //예외가 발생하든 발생하지않든 다 거쳐가는곳 
			
		}

		System.out.println("프로그램 종료!");
		
		
		
		
	}

}
