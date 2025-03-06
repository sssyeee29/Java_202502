package ch01.ex02;

/*
 * 함수 2개 생성
 * 매개변수로 100 정수값을 전달하면
 * 함수1은 1~100 사이 홀수 값을 리턴하고 
 * 함수2는 1~100 사이 짝수 값을 리턴한다.
 * 메인함수에서 두 함수을 호출하고, 각 전달받은 값을 출력한다.
 */
public class FunctionExam01 {
// 16->25부터 쭉 진행 return까지 -> 15에 2550 넣음
// 17->35부터 쭉 진행 return까지 -> 16에 2500 넣음
	public static void main(String[] args) {
		int number = 100;
		
		int evenResult = evenSum(number); // 2550
		int  oddResult =   oddSum(number); // 2500
		
		System.out.println("짝수합: " + evenResult);
		System.out.println("홀수합: " + oddResult);
		
	}


	public static int evenSum(int number) { //짝수합
		int sum=0;
		for(int i=0; i<=number; i++)  {
			if( i%2 == 0)
				sum += i;
		}
		return sum;
	
	}	
	
	public static int oddSum(int number) { //홀수합
		int sum=0;
		for(int i=0; i<=number; i++) {
			if( !(i%2 == 0) ) //나머지가 0이 아닌 경우 //if ( i%2 == 1 ) 나머지가 1인 경우 
				sum += i;
		}
		return sum;
	}

}