package ch01.ex01;

/*
 * 반환 O, 매개변수 O // 객체생성하고 호출하기 
 */
public class Function01 {

	public static void main(String[] args) {
		
		Function01 f1 = new Function01(); //클래스명이랑 같은걸로 써서 객체 생성
		int num1 = 10;
		int num2 = 20;
		
		int result = f1.add(num1, num2);
		
		System.out.println("result = " + result);
 		
	}
	
	int add(int n1, int n2) {
		return n1+n2;
	}

}
