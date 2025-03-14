package ex01;
 //클래스 정의와 객체 생성 실습(3) 
import java.util.Scanner;

public class SalaryExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월 입력>>");
		int month = sc.nextInt();
		
		System.out.println("등급(1~4) 입력>>");
		int grade = sc.nextInt();
		int salary = 0;
		SalaryExpr expr = null; // 참조하는게 없다 = if부분이랑 else부분 각자 해당되는거 읽게두는것
		
//		if(month % 2 == 0) { // month 짝수 -> 보너스 달 
//			expr = new SalaryExpr(100);
//		}else {// month 홀수 
//			expr = new SalaryExpr(0);
//		}
	
		expr = (month % 2 == 0) ? new SalaryExpr(100) : new SalaryExpr(0);; // 삼항연산자를 써도되고
																				//위에 if문 써도됨

		salary = expr.getSalary(grade);		
		

		System.out.println( month + "월 " + grade + "등급의 월급은 " + salary + "입니다.");
	}
	
	
}
	
	
	

