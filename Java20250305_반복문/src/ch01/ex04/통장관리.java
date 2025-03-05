package ch01.ex04;

import java.util.Scanner;

public class 통장관리 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int balance = 0; //balance 뜻이 잔고
		boolean flag = true; // false면 while문을 벗어나지마라 
		
		while(flag) {
		
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
	
			System.out.println("선택 > ");

			//문자열을 정수형으로 변환
			int num = Integer.parseInt(sc.nextLine()); //엔터까지 같이 읽어옴
			switch(num) {
			case 1 : 
				System.out.println("예금액>");
				balance += Integer.parseInt(sc.nextLine()); //balance에 누적해라 // 정수값만 읽어옴 
				break;				
			case 2 :
				System.out.println("출금액>");
				balance -= Integer.parseInt(sc.nextLine());
				break;
			case 3 :
				System.out.println("잔고>");
				System.out.println(balance);
				break;
			case 4 :
				flag = false;
				break;
			} //switch 끝
//			sc.nextLine(); // 버퍼지우기 ... 엔터키 지워라 
			
					
		} //while 끝
		System.out.println("프로그램 종료");
	}

}
