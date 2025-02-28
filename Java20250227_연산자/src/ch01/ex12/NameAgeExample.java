package ch01.ex12;

import java.util.Scanner;

public class NameAgeExample {

	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	
	System.out.println("이름 입력:");
	String name = sc.nextLine();// 엔터까지 같이 입력돼서 버퍼에서 넥스트라인이랑 엔터를 같이가져옴
	System.out.println("이름은 " + name);
	
	System.out.println("나이 입력:");
	int age = sc.nextInt(); // 정수만 가지고 와서 버퍼에 엔터는 남아있음
		// sc.nextLine(); 버퍼클리어 - 이걸 써줌으로써 엔터를 지우고 리셋시킴
	System.out.println("나이는 " + age);
	
	

	}

}
