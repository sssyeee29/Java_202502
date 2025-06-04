package ex06;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/*
 * 숫자 2개 전달하면 최대값 반환!
 */
public class Exam07 {

	public static void main(String[] args) {
		//<입력값, 입력값, 반환타입>
		//두개의 입력값을 전달하고 싶을때 BiFunction을 써줌(두개까지만 있고, 세개까지는 없음=>세개짜리 쓰고 싶으면 직접 만들어야함)
		BiFunction<Integer, Integer, String> biFunction = (n1,n2) -> String.valueOf("" + n1 + n2 );
		
		
		String str = biFunction.apply(10, 20);
		System.out.println(str);
	}
}









