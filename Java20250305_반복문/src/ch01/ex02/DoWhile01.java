package ch01.ex02;

public class DoWhile01 {

	public static void main(String[] args) {

		int sum=0;
		for(int i=1; i<=100; i++)
			sum += i;
		System.out.println(sum);
		
		int sum2 = 0; 
		int i = 0;
		while(i<=100) {
			sum2 += i;
			i++;
		}
		System.out.println(sum2);
		
		
		
		//do~while - 최소 한번은 실행
		int sum3 = 0; 
		int j = 0; // 초기값
		do {
			j++;  // 증가, 변동값
			sum3 += j;
		}while(j<100); 	//조건
		System.out.println(sum3);
	}

}
