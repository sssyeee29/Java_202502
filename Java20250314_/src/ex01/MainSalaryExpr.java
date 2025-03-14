package ex01;

import java.util.Scanner;

public class MainSalaryExpr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월 정보를 입력하세요");
		int month = sc.nextInt();
		
		System.out.println("등급정보를 입력하세요");
		int grade = sc.nextInt();
	
		boolean isBonusMonth = (month % 2) == 0;

		if(grade==1) {
			System.out.println("bonus + "  + 100);
		}

	}
	
	
}
	
	
	

