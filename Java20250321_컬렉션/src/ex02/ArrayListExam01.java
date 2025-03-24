package ex02;

import java.util.ArrayList;

public class ArrayListExam01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i)); // list.get하면 리스트를 꺼내옴 
		System.out.println();

		for(String str : list) // String 타입만 넣겠다. 
			System.out.println(str); //print str을 만나면 19번 str을 만나고 9번으로 가서 리스트에 있는걸 꺼냄 
		System.out.println();

		list.remove(0); // 0번째를 삭제하면 뒤에 있던 애들이 앞으로 당겨짐
		System.out.println(list.get(0)); // 원래 0번째를 삭제해서 출력하면 Box가 나옴 
		System.out.println(list.get(1));
		
		System.out.println();
		
		list.clear(); //all 삭제
//		System.out.println(list.get(0));
		
	}

}
