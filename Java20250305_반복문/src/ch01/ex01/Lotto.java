package ch01.ex01;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {

		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int배열
		 * 로또는 1~45 랜덤하게 저장 
		 * 단,중복불가
		 */
		
		int[] lotto = new int[6];
		boolean flag = false;
		
		for(int i=0; i<lotto.length; i++) {

			int temp = (int)(Math.random()*45)+1;
			// 중복 체크 과정 필요 - 앞에 나온 숫자들이랑 같은지 비교해야함
		
			for(int j=0; j<lotto.length; j++) {
				if(temp == lotto[j]) {
					flag = true;
					break;
				}
			}
			
			if(flag != true) // 중복되지 않았을때 처리
				lotto[i] = temp;
			else { //중복된 경우는 
				i--; // i값 하나 감소
				flag = false; //중복된 경우 true값으로 변경된 값을 원 상태로 변경(false) 
							//true로 바뀌었을때 다시 기본값 false로 바꿔줘야 중간에 오류없이 계속 나올수있음
			}
		}
		for(int i=0; i<lotto.length; i++)
			System.out.print(lotto[i] + " ");
	}
}
			
				
			
		
		
		
	
