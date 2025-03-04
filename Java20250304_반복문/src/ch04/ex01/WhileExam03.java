package ch04.ex01;

import java.util.Scanner;

public class WhileExam03 {

	public static void main(String[] args) {
	/*	
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("정수입력: ");
		int number = sc.nextInt();
				
		for(int i=1; i<=number; i++ ) {
			if(i%2 == 1) //홀수
			sum += i;
		}
		System.out.println(sum);
	*/

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("정수입력: ");
		int number = sc.nextInt();
		int i=1; // 초기값
		
		while(i<number) {
			if(i%2 == 1) //1부터 number까지 홀수합만 누적 
				sum += i;
			i++; // 증가값
		}
		System.out.println(sum);
	
	
	
	}

	

}
