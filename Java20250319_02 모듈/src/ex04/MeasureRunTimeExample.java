package ex04;

public class MeasureRunTimeExample { // 진행시간 읽기 

	public static void main(String[] args) {
		
		int sum = 0;
		
		long time1 = System.nanoTime(); // 시작과 끝에 넣어주면 됨 그러면 시작하고 끝날때까지의 시간을 구해줌 
		
		for(int i=0; i<=1000000; i++)
			sum += i;
		
		long time2 = System.nanoTime();
				
		System.out.println("합 : " + sum);
		System.out.println("소요시간 : " + (time2 - time1));
	} 

}
