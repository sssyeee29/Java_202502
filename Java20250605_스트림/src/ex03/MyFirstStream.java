package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFirstStream {

	public static void main(String[] args) {
		
		//list에서 값 초기화하기 
		List<String> list2 = new ArrayList<String>();
		list2.add("AA");		
		list2.add("BBB");		
		list2.add("CCCC");		
		list2.add("DDDDD");		
		list2.add("EEEEEE");	
		
		list2.remove(0); //0번째 AA 삭제 
		list2.add("FF"); //FF 추가 
		System.out.println(list2);
		
		                     //asList는 삭제랑 수정 불가 // 한번에 초기화하는거 
		List<String> list = Arrays.asList("AA", "BBB", "CCCC", "DDDDD", "EEEEEE");
	/*	
		list = new ArrayList<>(list);
		list.remove(0);
		for(String str : list)
			System.out.print(str + " ");
	*/
		
		list.stream().map(n-> n.length()) //list를 stream으로 생성(흘려보냄)
		.forEach(n-> System.out.print(n + " "));
		
		int total = list.stream().map(n-> n.length()) 
		.mapToInt(n->n).sum();
		System.out.println(total);
		
		int count = list.stream().mapToInt(n->n.length())
		.sum();
		System.out.println(count);
		
		
		
		
	}

}