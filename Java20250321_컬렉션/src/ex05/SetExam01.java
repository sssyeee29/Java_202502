package ex05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {}

public class SetExam01 {
	// 중복이 안됨-새로운 데이터를 넣을때 안에 들어가있으면 집어넣지 못하게끔(기본자료형 8개, String타입은 자바에서 안겹치게 해놓음 
	// 만약에 person, car등 클래스처럼 본인이 만드는거면 해시코드랑 이퀄스메소드를 써서 직접써서 적절하게 재정의 후 중복되지 않게한다. 
	// 입력한 데이터 순서가 없음(어떤게 나올지 모름) 

	public static void main(String[] args) {

		Set<String> list = new HashSet();
		
		list.add("Robot");
		list.add("Box");
		list.add("Toy");
		
		for(String str : list)// String이니까 만약에 겹치는걸 넣어도 알아서 걸러줌 
			System.out.println(str);
		System.out.println();
		
		System.out.println("---------------------");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
	}

}
