package ex06;

import java.util.function.BiFunction;
import java.util.function.Consumer;

@FunctionalInterface
interface TriFunction<T,M,R,Q>{
	public Q apply(T n1,M n2, R n3);
}

/*
 * 숫자 3개 전달하면 문자열로 합치기
 */
public class Exam08 {

	public static void main(String[] args) {
		
		//입력값이 3개면 직접 만들어서 쓰면됨 => 문자 세개를 입력해서 문자 하나반 받겠다. 
		TriFunction<String, String, String, String> tri = (n1, n2, n3)-> String.valueOf("" + n1 +n2+n3);
		
		Object o = new Object();
		
		
		String str = tri.apply("a","bb","cc");
		System.out.println(str);
	}
}









