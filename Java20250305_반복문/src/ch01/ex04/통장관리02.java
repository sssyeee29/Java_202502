package ch01.ex04;

import java.util.Scanner;

public class 통장관리02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int balance = 0; //balance 뜻이 잔고
		
		while(true) {
		
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
	
			System.out.println("선택 > ");

			//문자열을 정수형으로 변환
			int num = Integer.parseInt(sc.nextLine()); 
			
			if(num==1) {
				System.out.println("예금액>");
				balance += Integer.parseInt(sc.nextLine()); 
			}else if (num==2) {
				System.out.println("출금액>");
				balance -= Integer.parseInt(sc.nextLine());
			}else if (num==3) {
				System.out.println("잔고>");
				System.out.println(balance);
			}else if(num == 4) {
				break;
			} 
		}
		System.out.println("프로그램 종료");
	}
}
