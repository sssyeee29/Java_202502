package ch01.ex03;

/*
 * 2개 값을 입력받아서, 더하는 기능을 수행
 * 매개변수o, 반환o
 */
public class Add04 {

	public static void main(String[] args) {

		System.out.println("main함수 시작");
		int num1 = (int)(Math.random()*100) + 1; 
		int num2 = (int)(Math.random()*100) + 1; 
		
		int  result = add(num1, num2);
		
		System.out.println(result);	
							
		System.out.println("프로그램 종료!");
	}
	
	public static int add(int numA, int numB) {
		System.out.println("numA = " + numA + " numB = " + numB);
		int sum = numA + numB;
		return sum;
	}
		
	

}
