package ch01.ex07;

public class AccuracyExam02 {

	public static void main(String[] args) {

		double sum = 0;
		
		for(int i=0; i<30; i++) // 0.1을 30번 누적 => 3.0
			sum = sum + 0.1;
		
		System.out.println(sum);
		
	}

}
