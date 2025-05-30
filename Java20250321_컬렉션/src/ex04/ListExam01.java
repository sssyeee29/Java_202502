package ex04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListExam01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("TOY");
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();

		for(String str : list) //향상된 for문 
			System.out.println(str);
		System.out.println();
		System.out.println("----------------------------");
		
		//반복자 
		Iterator<String> itr = list.iterator(); // 코드 최소화 하기위해 // 반환타입 : Iterator
		
		while(itr.hasNext()) { //가져올 값이 있냐고 물어보고 가져올거 있으면 true가 반환되니까 가서 값을 가져옴 
			System.out.println(itr.next());
		}
		System.out.println();
		
		itr = list.iterator(); // 다음거 구할때도 한 번 더 써줘야함 // why?
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		list.remove(0);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
//		System.out.println(list.get(2)); //0부터 지워지고 칸이땅겨지니까 2번은 빈칸
		
		System.out.println();
		
		list.clear(); //all 삭제
//		System.out.println(list.get(0));
		
	}

}
