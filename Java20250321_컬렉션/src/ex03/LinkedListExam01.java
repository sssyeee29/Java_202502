package ex03;

import java.util.LinkedList;

import java.util.ArrayList;
import java.util.List;
public class LinkedListExam01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();// 앞에 List로 쓰면 상위클래스이기 때문에 수정에 용이, ArrayList를 LinkedList이걸로 자유롭게 바꾸기 가능 
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("TOY");
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();

		for(String str : list)
			System.out.println(str);
		System.out.println();

		list.remove(0);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
//		System.out.println(list.get(2)); //0부터 지워지고 칸이땅겨지니까 2번은 빈칸
		
		System.out.println();
		
		list.clear(); //all 삭제
//		System.out.println(list.get(0));
		
	}

}
