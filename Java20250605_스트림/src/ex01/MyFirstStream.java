package ex01;

import java.util.Arrays;

public class MyFirstStream {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		int total = Arrays.stream(arr).filter(n -> n%2 ==1).sum();
		
		System.out.println(total);
		
		long count = Arrays.stream(arr).filter(i -> i%3==0).count();
		System.out.println(count); //6이랑 3만 해당됨, count는 통과하는 갯수를 세는거라서 2
		
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
		// 반복하면서 하나씩 값을 찍어줌 
	}

}