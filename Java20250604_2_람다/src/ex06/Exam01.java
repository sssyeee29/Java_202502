package ex06;

import java.util.function.BiFunction;

//매개변수있고, 반환형 있는 경우
@FunctionalInterface
interface MaxInterface{
	int max(int num1, int num2);
}

public class Exam01 {

	public static void main(String[] args) {
		
		//익명클래스
		MaxInterface max1 = new MaxInterface() {
			@Override
			public int max(int num1, int num2) {
				return (num1 > num2) ? num1 : num2 ;
			}
		};
		
		//람다   								//{} 이 괄호 없앨땐 return도 같이 지워야함 
		MaxInterface max2 = (num1, num2) ->  (num1 > num2) ? num1 : num2 ;
		
		System.out.println(max1.max(5, 1));

		System.out.println(max2.max(5, 11));
		
		
		//public interface BiFunction<T,U,R> => java에서 미리 만들어둔거 쓰기
		
		BiFunction<Integer, Integer, Integer> b1 = (i,j) -> i+j;
		
		int sum = b1.apply(10, 10);
		System.out.println(sum);
	}

}