package ch04.ex01;

public class ForExam01 {

	public static void main(String[] args) {

		
		int sum = 0;
		
		for(int i=1; i<=100; i++)  { //1~100까지 반복
			if( i % 2 == 0) { // 홀수인지?
				sum += i;	 // 홀수이면 누적			
			}
		}
		
		System.out.println(sum);
		
	}

}
