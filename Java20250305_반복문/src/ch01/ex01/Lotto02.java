package ch01.ex01;

import java.util.Random;

public class Lotto02 {

	public static void main(String[] args) {

		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int배열
		 * 로또는 1~45 랜덤하게 저장 
		 * 단,중복불가
		 */
		
		int[] lotto = new int[45];
		
		for(int i=0; i<lotto.length; i++) { //i의 값은 방번호 0~44번까지
			lotto[i] = i+1;
		}
		// 배열섞기
		for(int i=0; i<500; i++) { // 500번 섞겠다 => 방번호
			int index = (int)(Math.random()*45); // 1~45
			
			int temp = lotto[0]; 	// 0번째 방에 있는 숫자를 temp에 업력해라, 
			lotto[0] = lotto[index];
			lotto[index] = temp;
			
		}
		// 배열45개 칸 중 앞자리 6자리만 출력 (0~5번째 자리까지)
		System.out.println("이번 주 예상 로또 번호 : ");
		for(int i=0; i<6; i++)
			System.out.print(lotto[i] + " ");
			
				
				
	
		
		
	}

}
