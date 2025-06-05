package ex02;

import java.util.Arrays;

public class MyFirstStream {

	public static void main(String[] args) {
		
		//문자열 길이값 출력
		String[] arr = {"AA", "BBB", "CCCC", "DDDDD", "EEEEEE"};
		
		for(String str : arr) { //"arr 안에 있는 모든 String 값을 하나씩 str에 담아서 반복하겠다."
			System.out.print(str.length() + " ");
		}
		System.out.println();
		
		Arrays.stream(arr)
			.map(n-> n.length()) //map : 변환에 사용하는 중간연산자 ->값을 하나씩 꺼내서 원하는 형태로 바꿈(형변환)
			.forEach(n-> System.out.print(n + " "));

		int total = Arrays.stream(arr)		//AA가 들어갈땐 문자열 -> map을 만나면 int로 바꿈 
				.mapToInt(n->n.length()) //.mapToInt: 들어가는 애가 뭔지는 모르는데 int로 바꾸는 역할(정수로 흘려보내겠다)
				.sum(); // 그 통과한 int값들의 합 
		
		System.out.println("\n" + total);
		
	}

}