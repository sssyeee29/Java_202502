package ch01.ex03;

public class BreakEx01 {

	public static void main(String[] args) {

		
		// 1~100까지 누적하다가, sum 값이 2000이상이 되는 순간 i,sum값 출력
		int sum=0;
		int i=0;
		for(; i<=100; i++) {
			sum += i;
			if(sum >= 2000) break; // 2000이랑 같거나 크면 브레이크
		}
		System.out.println(i);
		System.out.println(sum);
	}

}
