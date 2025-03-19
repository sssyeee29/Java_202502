package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam10 {

	public static void main(String[] args) {
		int result = 0;
		
		try {
			result = divide(10,0);	
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());  
		}
		
		System.out.println(result);
		
		System.out.println("프로그램 종료!");

	}
	
	//함수 직접 처리하지 않고 던지기  
	public static int divide(int num1, int num2) throws ArithmeticException {
		// throw를 써주면 (나만의)메세지를 적어서 전달해줄수있다. 
		if(num2 == 0) throw new ArithmeticException("0으로 나눌수는 없습니다.");
		
		int result = num1/num2;
		
		return result+100;
	}

}
	
