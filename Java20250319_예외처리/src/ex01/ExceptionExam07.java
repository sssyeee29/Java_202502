package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam07 {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis = new FileInputStream("file.txt")) {
		} catch (IOException e) { //close를 쓰는걸 까먹을때 이렇게 써줌 
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("file.txt")) {
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료!");

		
	}

}
	
