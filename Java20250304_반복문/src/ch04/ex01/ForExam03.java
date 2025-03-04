package ch04.ex01;

import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {
		/*
		 * 키보드에서 숫자 입력 받는다.
		 * 5     --> 1~5 누적합 15
		 * 10    --> 1~10 누적합 55
		 * 100   --> 1~100 누적합 5050
		 */
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("정수입력: ");
		int number = sc.nextInt();
				
		for(int i=1; i<=number; i++ ) {
			if(i%2 == 1) //홀수
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		
		for(int i=1; i<=number; i=i+2 ) {
			sum += i;
		}		
		System.out.println(sum);
	}
	
		
}
