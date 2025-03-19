package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam12 {

	public static void main(String[] args) throws FileNotFoundException{
		
//		FileInputStream fis = new FileInputStream("./src/ex01/test.txt"); //파일 없으면 어떻게할래? main에 throws를 적어서 처리함 
		FileInputStream fis = new FileInputStream("src/ex01/test.txt");  
		
		System.out.println("프로그램 종료!");

	}

}
	
