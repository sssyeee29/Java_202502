package ch01.ex02;

/*
 * 함수 2개 생성
 * 매개변수로 10 정수값을 전달하면
 * 함수1은 1~10 사이 홀수 값을 리턴하고 
 * 함수2는 1~10 사이 짝수 값을 리턴한다.
 * 메인함수에서 두 함수을 호출하고, 각 전달받은 값을 출력한다.
 */
public class FunctionExam02 {

	public static void main(String[] args) {
		int[] number = new int[10];
		
		for(int i=0; i<10; i++) {
			number[i] = (i+1)*10;
		}
		for(int i=0; i<10; i++)
			System.out.print(number[i] + " "); // 어떻게 출력이 되는지 한 번 찍어본거
		System.out.println();
		
		int resultA = evenSum(number); // 10부터 100까지 찍혀있는걸 같이 공유함
		System.out.println(resultA);
		
		int resultB = oddSum(number); // number에 250 누적돼서 resultB가 250
		System.out.println(resultB);
	}
	
	

	public static int evenSum(int[] numA) { //짝수합
	
		int sum=0;
		for(int i=0; i<numA.length; i++)  {
//			System.out.print(numA[i] + " ");
			
			int num = numA[i] / 10;
			if(num % 2 == 0) // if(numA[i] / 10) % 2 == 0
				sum += numA[i];
		}
		return sum; // 300이 누적되어있음
	
	}	
	
	public static int oddSum(int[] numB) { //홀수합
		
		int sum=0;
		for(int i=0; i<numB.length; i++) { // 0부터 9까지 
			
			if( (numB[i] / 10) % 2 == 1)
				sum += numB[i];
		
		}
		return sum;
	}
		
		

		
}