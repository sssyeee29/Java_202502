package cho1.ex02;

import java.util.Scanner;

public class 월계산프로그램 {

	public static void main(String[] args) {
		/* 
		 * 문제설명 : 사용자가 월을 입력하면  해당 월이 어느 계절에 해당하는지를 출력하는 프로그램을 작성하세요.
		 			계절은 다음과 같이 결정됩니다.
		 			
		 			12월, 1월, 2월 = 겨울
		 			3월, 4월, 5월 : 봄
		 			6월, 7월, 8월 : 여름
		 			9월, 10월, 11월 : 가을
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월 입력>>");
		int month = sc.nextInt();
		String result="";
		
		if(month == 12 || month == 1 || month == 2) {
			result = "겨울";		
//		}else if(month >= 3 && month == <= 5)
		}else if(month == 3 || month == 4 || month == 5) {
			result = "봄";
		}else if(month == 6 || month == 7 || month == 8) {
			result = "여름";
		}else if(month == 9 || month == 10 || month == 11) {
			result = "가을";
		}
		
		System.out.printf("입력한 %d는 %s입니다.\n", month, result);
	}
	
	
	
	
		

	
	

}
