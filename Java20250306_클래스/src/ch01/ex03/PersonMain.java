package ch01.ex03;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
				
		Person person 
		= new Person("홍길은", 50, "010-2222-3333"); //person에 있는 15줄에 전달돼서 출력되는것
		
		person.age = 20;
		
		person.나이출력();
		person.이름출력();
		person.전화번호출력();
		
		Person p2 = new Person("홍길동", 20, "010-1111-2222");
		p2.이름출력();
		p2.나이출력();
		p2.전화번호출력();
		
				
	}

}
