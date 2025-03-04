package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열07 {

	public static void main(String[] args) {
		
		// 구구단 출력

		for(int i=2; i<=9; i++) { //행
			System.out.printf("*******%d단*******\n", i);
			for(int j=1; j<=9; j++) { //열
				System.out.printf("%dx%d=%d\n", i,j, i*j);
			}
			System.out.println();
		}
	}

}

