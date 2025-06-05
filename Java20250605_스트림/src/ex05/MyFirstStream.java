package ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyFirstStream {

	//배열은 같은 자료형, 수정삭제불편 // list는 다른 자료형, 수정삭제편함
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("alice", "bob", "charlie");
	
		
		System.out.println(list);
		
		//대문자로 출력
		list.stream()
		.map(str-> str.toUpperCase())  //대문자 변환
		.forEach(n-> System.out.println(n));
		
		//대문자로 변환된 데이타를 리스트로 저장
		List<String> upperCaseNames = list.stream()
									.map(str->str.toUpperCase())
									.collect(Collectors.toList());
//									.toList();
		
//		upperCaseNames.add("FFFF");
		System.out.println(upperCaseNames);
		System.out.println("-------------------------");
		
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println(arr);
		
		Arrays.stream(arr) //1,2,3,4,5,6,7,8
		.filter(n-> n%2==0) //3.6
		.forEach(n->System.out.print(n + " ")); //2,4,6,8
		System.out.println();
	    
		//.toList(); 생성된 리스트는 수정, 삭제 불가 .. 
		List<Integer> iList= Arrays.stream(arr) 
		.filter(n-> n%2==0) //2,4,6,8
		.boxed()			//int -> Integer (Boxing) // 직접 박싱을 해서 기본 자료형을 integer로 바꿔서 사용 
		.toList();		 
		System.out.println(iList);
//		iList.add(10);
//		iList.remove(0);
		System.out.println(iList);

		
		//.collect(Collectors.toList()); 수집한 리스트는 수정,삭제 가능 
		List<Integer> iList2 = Arrays.stream(arr) 
				.filter(n-> n%2==0)
				.boxed()
				.collect(Collectors.toList());	
		System.out.println(iList2);
		
		iList2.add(10);
		iList2.add(100);
		iList2.remove(0);
		System.out.println(iList2);
		
		
	}

}