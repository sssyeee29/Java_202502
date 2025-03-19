package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam08 {

	public static void main(String[] args) {
		int result = 0;
		result = divide(10,2);
		System.out.println(result);
		
		System.out.println("프로그램 종료!");

	}
	
	//함수 직접 처리한 경우
	public static int divide(int num1, int num2) {
		int result = 0;
		try {
			result = num1/num2; // 괄호밖에서 int result 이렇게 선언했으면 괄호안에서는 타입까지 같이 못씀
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
	
