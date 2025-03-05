package ch01.ex01;

public class 정렬 {

	public static void main(String[] args) {
			
		int[] numArr = new int[10];
		int tmp;
		
		//System.out.println((int)(Math.random()*100)+1)'; - 정수값만 나옴
		//랜덤하게 1~100사이 값을 배열에 넣는다
		for(int i=0; i<10; i++) {
			tmp= (int)(Math.random()*100)+1; // 1부터 백까지 랜덤하게 숫자를 뽑아줌
			numArr[i] = tmp;	// 지정자리에 랜덤하게 나온숫자를 지정해서 넣어라 // i는 0~0까지 커지니까
		}
		
		//랜덤하게 배열 지정된 값 출력
		for(int i=0; i<10; i++)
			System.out.print(numArr[i] + " "); // " " 룰 이용해서 숫자마다 한칸씩 띄어지는거임
		
	}

}
