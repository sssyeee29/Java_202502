package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열03 {

	public static void main(String[] args) {
		//5명 점수를 입력 받아서,  총점 평균을 구하기
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5]; // 배열선언, int배열5개가 있다.
		int sum =0;
		
		for(int i=0; i<5; i++) {
			System.out.println(i+1 + "번학생 자바점수>>");
			num[i] = sc.nextInt();
			sum += num[i];
		}
		
				
		double average = sum/5.0;
		System.out.printf("총점 : %d, 평균 : %.2f\n", sum, average);
		
		
	}
		
}
