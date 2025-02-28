package cho1.ex02;

import java.util.Scanner;

public class 버스요금02 {

	public static void main(String[] args) {
	
		/*
		 * 버스요금 계산 프로그램
		 * 기본요금 : 2000
		 * 1~5세 : 무료
		 * 6~12세 : 50% 할인
		 * 13~18세 : 25% 할인
		 * 19~64세 : 0% 할인
		 * 65세 이상 : 무료
		 */
		
		Scanner sc = new Scanner(System.in); // 콘솔에 우리가 입력을 해야할때 이걸 제일처음에 써주고 시작
		int age = 0;
		int fee = 2000; // 버스요금은 정수니까 int를 써줌
		double rate = 0; // 할인율
		
		System.out.println("나이 입력:");
		age = sc.nextInt();
		
		if(age >= 65 || age <= 5) {
			rate = 0;
		}else if(age>=6 && age<=12) {
			rate = 0.5;
		}else if(age>=13 && age<=18) {
			rate = 0.75;
		}else if(age>=19 && age<=64) {
			rate = 1;
		}
		//	2000*1.0 => 2000.0
		fee = (int)(fee * rate); // fee*rate 나온 실수값은 잘라버려라, 어차피 fee는 정수니까
		System.out.println("버스요금 : " + fee + "원입니다.");
		
		System.out.println("종료");
		
		
		
	
		
	
		
  
	}
}

 
