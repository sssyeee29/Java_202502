package ch01.ex02;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		//이름, 나이, 전화번호만 입력
		// 메소드 호출해서 출력
		
		Person person = new Person();
		
		person.name = "이연수";
		person.age = 25;
		person.phone = "010-2222-3333";
		
		person.나이출력(person.age);
		person.이름출력(person.name);
		person.전화번호출력(person.phone);
		
		
		
		
	}

}
