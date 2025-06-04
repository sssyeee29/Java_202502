package ex06;

import java.util.function.Function;

interface AAA {
	int doubleFunc(int num);
}

public class Exam03 {

	public static void main(String[] args) {
		
		AAA a = num -> num*num;
		System.out.println(a.doubleFunc(5));
		
				//매개변수  //반환타입
		Function<Integer, Integer> function =  t -> t*t;
			
		System.out.println(function.apply(5)); //function은 준비된 함수가 apply라서 그냥 그거 쓰면됨 
		
		function.apply(10);
	}

}