package ex04;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String data1 = "홍길동&이수홍,박연수-박수홍";
		
		String[] arr = data1.split("&|,|-"); //|는 or라는 뜻 &거나 ,거나 "면 분리해줘
		
//		for(String token : arr)
//			System.out.println(token);
		System.out.println(Arrays.toString(arr)); //이걸쓰거나 14,15번을 쓰거나 
		
		System.out.println();
		
		String data2 = "홍길동/이수홍/박연수-박수홍";
		
		StringTokenizer st = new StringTokenizer(data2, "/,-");
		while(st.hasMoreTokens()) { // 가져올 데이터가 있니? 20번에 적혀있는값을 가져와서 24번 문장에서 st.nextToken이 찍어줌 
			System.out.println(st.nextToken());			//가져올 값이 없으면 while에서 false를 반응해서 빠져나옴 
		}
	}

}
