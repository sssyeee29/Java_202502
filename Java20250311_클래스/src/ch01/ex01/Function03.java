package ch01.ex01;

import java.util.Scanner;

/*
 * 반환 O, 매개변수 X // String 타입으로 타입 다 동일하게 바꿔줘야함 
 */
public class Function03 {

	public static void main(String[] args) {
				
		String result = add();
		
		System.out.println("result = " + result);
 		
	}
	
	static String add() { 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력>> ");
		
//		String name = sc.nextLine();
//		return name;
		
		return sc.nextLine(); //24,25 안써주고 바로 이 문장써서 출력해줘도 됨 
								// 바로 이렇게 써서 간결하게 할 수 있고, 메모리 공간도 적어짐 
		
		
	}

}
