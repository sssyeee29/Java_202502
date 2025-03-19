package ex01;

import java.util.Scanner;

public class ExceptionExam02 {

	public static void main(String[] args) {
		

// 		int num = 10/0;  ArithmeticException
	
//		int[] arr = new int[5]; //0~4
//		arr[4] = 100;
//		arr[5] = 10; ArrayIndexOutOfBoundsException

		String str = null; 
		
		if(str != null) // 예외사항이 발생하는걸 방지하기위해 if문을 써서 다 처리를 해줘야함 
			System.out.println(str.length()); //NullPointerException
		
		
		String str2 = "korea";

		if(str2 != null)
			System.out.println(str2.length()); 
	}

}
