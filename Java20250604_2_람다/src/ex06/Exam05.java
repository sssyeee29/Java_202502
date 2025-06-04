package ex06;

import java.util.function.Supplier;

/*
 * 랜덤숫자 하나 뽑기
 */
public class Exam05 {

	public static void main(String[] args) {
		
		//매개변수 전달은 없는데, 반환타입만 있는거 // interger가 반환타입 
		Supplier<Integer> supplier = () ->  { //매개변수가 없어서 () 이렇게 씀 
			return (int)(Math.random()*45); //0~45까지 랜덤으로 난수로 반환
		};
		
		//이렇게 한줄로도 쓸 수 있음 
//		Supplier<Integer> supplier = () -> (int)(Math.random()*45); 
		
		
		int result = supplier.get();
		
		System.out.println( result  );
	}

}