package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열02 {

	public static void main(String[] args) {
		//5명 점수를 입력 받아서,  총점 평균을 구하기
			
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		
		System.out.println("1번 학생 자바점수 : ");
		num[0] = sc.nextInt();
		
		System.out.println("2번 학생 자바점수 : ");
		num[1] = sc.nextInt();
		
		System.out.println("3번 학생 자바점수 : ");
		num[2] = sc.nextInt();
		
		System.out.println("4번 학생 자바점수 : ");
		num[3] = sc.nextInt();
		
		System.out.println("5번 학생 자바점수 : ");
		num[4] = sc.nextInt();
		
		int sum = num[0] + num[1] + num[2] + num[3] + num[4];
		double average = sum/5.0;
		
		System.out.printf("총점 : %d, 평균 : %.2f\n", sum, average);
		
		
	}
		
}
