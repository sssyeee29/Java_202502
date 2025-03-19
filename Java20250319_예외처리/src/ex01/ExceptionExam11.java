package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam11 {

	public static void main(String[] args) throws ArithmeticException {
		// try~catch로 받아주지 않고 main에도 throws를 적어서 던져줄 수 있음 -> 밑에 코드도 적용이 안됨
		int result = 0;
		
		result = divide(10,0);	
				
		System.out.println(result);
		
		System.out.println("프로그램 종료!");

	}
	
	//함수 직접 처리하지 않고 던지기 (throws를 적어주면 됨)
	public static int divide(int num1, int num2) throws ArithmeticException {

		if(num2 == 0) throw new ArithmeticException("0으로 나눌수는 없습니다.");
		
		int result = num1/num2;
		
		return result+100;
	}

}
	
