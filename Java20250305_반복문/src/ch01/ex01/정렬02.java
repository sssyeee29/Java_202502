package ch01.ex01;

import java.util.Random;

public class 정렬02 {

	public static void main(String[] args) {
	
		//seed값을 넣어주면 랜덤숫자가 일정하게 나온다.
//		int seed = 100; // 실행할때마다 매번 같은 숫자가 나옴. 즉, 값이 정해져있음
//		Random random = new Random(seed);
		
		//seed값이 없으면 랜덤하게 추출
		Random random = new Random();
		
		int[] numArr = new int[3]; // 배열로 반복한다하면 이 문장에만 숫자를 바꿔주고 숫자 들어갈 자리에 numArr.length 이거 넣어주면
										// 알아서 길이 정해서 계산해줌 
		int tmp;
		
		//System.out.println((int)(Math.random()*100)+1)'; - 정수값만 나옴
		//랜덤하게 1~100사이 값을 배열에 넣는다
		for(int i=0; i<numArr.length; i++) {
			tmp= (int)random.nextInt(100)+1; //이거를 쓰려면  9번 문장을 반드시 적어야 사용가능
			numArr[i] = tmp;
		}
		
		//랜덤하게 배열 지정된 값 출력
		for(int i=0; i<numArr.length; i++)
			System.out.print(numArr[i] + " ");
		
		System.out.println();
		System.out.println();

		//최대값, 최소값 출력
		int max, min; 
		max = min = numArr[0];
		for(int i=1; i<numArr.length; i++) { //0을 넣으면 0번째가 본인이랑 두개를 비교하게 되니까 0다음 1번째부터 비교하라고 1을넣음 
			
			if(max < numArr[i]) // numArr가 최대값을 가지고 있다 // 최대값
				max = numArr[i];
			
			if(min> numArr [i]) //최소값
				min = numArr[i];
			
		}
		
		//코드 구현 
		System.out.println("최대값: " + max + ", 최소값: " + min );
		
		System.out.println();
		
		
		//총점, 평균
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<numArr.length; i++) {
			sum += numArr[i];
		
		avg = (double)sum/numArr.length; // 정수/정수 => 정수, 정수/실수=> 실수 // sum정수랑 10정수랑 계산하면 정수라서 소수점 자리가 안나옴 
		// 정수/정수 => 정수, 이렇게 계산돼서 평균에서 소수점을 보려면 둘중에 하나는 double로 바꿔줘야함
		}
		//코드 구현
		System.out.printf("총점 : %d, 평균 : %.2f\n", sum, avg);
		
		System.out.println();
		
		// 정렬 (버블정렬)
		int temp;
		for (int i=0; i<numArr.length; i++) { //회전수 : 첫회전하면 맨뒤 큰자리는 정해지니까 ,,
			for(int j=0; j<numArr.length-1-i; j++) { // 앞, 뒤 비교하는 용도, 맨 뒷자리는 처음 돌렸을때 정해지니까 -1 //
													// i가 0이면 맨뒷자리, i가 1이면 뒤에서 두번째자리가 정해지니까 계산의 최소화를 위해 -1
													// 이미 자리는 하나씩 정해지니까 또 계산하면 무의미함(뒷자리는 정해져있음)				
													// 8-1=7, 7-i(2)=5 따라서 다섯번째 자리까지만 계산한다 
				if(numArr[j]> numArr[j+1]) { //j는 0번째 자리, j+1은 1번째 자리// 1을 넣으면 1번째랑 2번째 자리 비교
					temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;	//temp에 넣어질때  자리가 바뀜
				}
			}
		}
		
		for(int i=0; i<numArr.length; i++)
			System.out.print(numArr[i] + " ");
		
	}

}
