package ch01.ex01;

/*
 * 반환 O, 매개변수 O // 객체생성 안하고 바로 static써서 호출하기
 */
public class Function02 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int result = add(num1, num2);
		
		System.out.println("result = " + result);
 		
	}
	
	static int add(int n1, int n2) { // static 붙여서 객체없이 바로 호출)
		return n1+n2;
	}

}
