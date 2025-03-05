package ch01.ex03;

public class ContinueEx01 {

	public static void main(String[] args) {

		
		// 1~100사이에서 홀수 합 구하기 
		int sum = 0;
		
		for(int i=0; i<=100; i++) {
			if(1%2 == 1) // 나머지가 1인애들만 더해준다 
				sum += i; // i를 더해서 sum에 계속 누적시켜서 계산
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for(int i=0; i<=100; i++) {
			
			if(1%2 == 0) continue; 
			sum2 += i;
	
		}
		System.out.println(sum2);
		
	}
	

}
