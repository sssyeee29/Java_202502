package ch04.ex01;

import java.util.Scanner;

public class WhileExam04 {

	public static void main(String[] args) {
		/*
		// 구구단 출력

				for(int i=2; i<=9; i++) { //행
					System.out.printf("*******%d단*******\n", i);
					for(int j=1; j<=9; j++) { //열
						System.out.printf("%dx%d=%d\n", i,j, i*j);
					}
					System.out.println();
				}
		*/
		
		int i=2;
		
		while(i<=9) {
			
			int j=1; // j값이 여기에 무조건 반드시 있어야함, 없으면 2단 제외하고 다른단은 안나옴
			System.out.printf("*******%d단*******\n", i);
			while(j<=9) { // j가 10이 될때까지 반복
				System.out.printf("%dx%d=%d\n", i,j, i*j);
				j++;
			}
			System.out.println();
			
			i++;
			
		}
			
	}

}
