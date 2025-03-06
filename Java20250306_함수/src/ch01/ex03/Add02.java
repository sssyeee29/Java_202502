package ch01.ex03;

/*
 * 2개 값을 입력받아서, 더하는 기능을 수행
 * 매개변수o, 반환x
 */
public class Add02 {

	public static void main(String[] args) {

		System.out.println("main함수 시작");
		// 메인에서 입력 받은 값을 함수에 전달 
		int num1 = (int)(Math.random()*100) + 1; 
		int num2 = (int)(Math.random()*100) + 1; 
		
		add(num1, num2);
		
		System.out.println("프로그램 종료!");
	}
	
	public static void add(int numA, int numB) { //16에서 int로 받아줬으니까 21번도 정수
		
		System.out.println("add()시작");
				
		System.out.println(numA + " + " + numB + " = " + (numA+numB));
		
	}
	

}
