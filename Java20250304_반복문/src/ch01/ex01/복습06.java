package ch01.ex01;

import java.util.Scanner;

public class 복습06 {

	//함수 main
	public static void main(String[] args) {
		// 지역변수 
		int num = 0;
		int num2 = 0;
		
		{
			int num3 = 0; //블럭변수 - 정해진 블럭안에서만 사용가능,이블럭 안에서 벗어나면 에러남
			num++;
			num2++;
			System.out.println(num3); // 블럭을 벗어나는 순간 num3은 소멸
		}
		num++;
	}
	
	
	//함수 func
	public static void func() {
		int num = 0;
	}
	
		
}
