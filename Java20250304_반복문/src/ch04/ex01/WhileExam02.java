package ch04.ex01;

public class WhileExam02 {

	public static void main(String[] args) {
		
		/*
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			if(i % 2 == 1){
			sum += i; // 
		}
		
		System.out.println("sum = " + sum);
		*/
		
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			if(i % 2 ==1)
				sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
