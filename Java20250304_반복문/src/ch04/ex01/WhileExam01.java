package ch04.ex01;

public class WhileExam01 {

	public static void main(String[] args) {
		/*
		 * int sum = 0;
				초기값         조건    증가/감소(변동)
				for(int i=1; i<=100; i++)  {
				sum += i;			
		
		 */
		
		
		int sum = 0; 
		int i = 1; // 초기값
		
		while(i<=5) { // 조건 , 조건이 만족하는 순간만 이행
			sum +=i;
			i++; //증가/감소(변동)
		}
		System.out.println("sum=" + sum);
	}

}
