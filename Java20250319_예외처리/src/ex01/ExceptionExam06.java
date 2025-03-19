package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam06 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("file.txt"); //파일을 읽어오는과정에서 파일을 열어둔상태
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				fis.close(); //파일을 읽어주면 꼭 닫아줘야함 
			} catch(IOException e) {
				e.printStackTrace();
		}
		

		System.out.println("프로그램 종료!");

		
	}

}
	}
