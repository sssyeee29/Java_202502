package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열 {

	public static void main(String[] args) {
		//5명 점수를 입력 받아서,  총점 평균을 구하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번 학생 자바점수 : ");
		int numA = sc.nextInt();
		
		System.out.println("2번 학생 자바점수 : ");
		int numB = sc.nextInt();
		
		System.out.println("3번 학생 자바점수 : ");
		int numC = sc.nextInt();
		
		System.out.println("4번 학생 자바점수 : ");
		int numD = sc.nextInt();
		
		System.out.println("5번 학생 자바점수 : ");
		int numE = sc.nextInt();
		
		int sum = numA + numB + numC + numD + numE;
		double average = sum/5.0;
		System.out.printf("총점 : %d, 평균 : %.2f\n", sum, average);
		
		
		}
		
}
