package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열06 {

	public static void main(String[] args) {
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {	// 열
				System.out.print("* ");
			}
			System.out.println();
			
		}
	
		System.out.println();
		System.out.println();

		// 이중 for문
		
		for(int i=0 ; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
	}
		System.out.println();
		System.out.println();
		
		for(int i=0 ; i<5; i++) { 
			for(int j=0; j<5-i; j++) { 
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

