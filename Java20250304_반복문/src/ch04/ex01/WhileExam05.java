package ch04.ex01;

import java.util.Scanner;

public class WhileExam05 {

	public static void main(String[] args) {
	/*	
		int count=0;
		for(; ; count++ ) { // 조건이 없으면 그냥 무한반복
			
			if(count>100) break;
			
			System.out.println(count);
			
		}
		*/
		
	  // for문보다는 일반적인 형태
		int cnt=0;
		
		while(true) {
			cnt++;
			if(cnt>100) break;  //적절하게 조건을 만나면 빠져나감
			System.out.println(cnt);
		}
	}

}
