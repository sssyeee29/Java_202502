package ex06;

import java.util.function.Consumer;

/*
 * 숫자 전달하면 출력!
 */
public class Exam06 {

	public static void main(String[] args) {
		
		//consumer는 값을 하나 투입하면 반환타입은 없고 그냥 값을 소비하고 끝냄
		Consumer<Integer> consumer = num -> System.out.println(num);

		//메소드참조
		Consumer<Integer> consumer2 = System.out::println;
		
		//accept라는 (실행)메소드가 있음. 이거 사용하면됨
		consumer.accept(199);
		consumer2.accept(299);
	}
}