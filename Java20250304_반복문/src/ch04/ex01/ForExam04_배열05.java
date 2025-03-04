package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열05 {

	public static void main(String[] args) {
		
		//7명학생 점수 입력받아서, 총점, 평균 구하기
		
		Scanner sc = new Scanner(System.in);
		// 예시>> int num = 0;
		
		int[] student = new int[] {10, -3, -700, 1, 2, 9, 3};
		
		int sum = 0;
		double average = 0;
		
		
		for(int i=0; i<7; i++) {
						
			sum += student[i];
			
		}
		
		average = sum/7.0;
		System.out.printf("총점 : %d, 평균 : %.2f\n", sum, average);
		System.out.println("7번째 값 출력 : " + student[6]);
		
		System.out.println("------------------------------------");
		
		//max {99,88,77,33,100,80,50};
		
		int max ;
		int min ;
		max = student[0];
		min = student[0];
		for(int i=0; i<7; i++) {
			if(max < student[i])
				max = student[i];

			if(min > student [i]) // 0보다 작은 수가 없어서 0이나옴 
				min = student[i];
			
		}
		
		//코드
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		System.out.println("------------------------------------");
		/*
		 * {-1, -3, -700, 1, 2, 9, 3};
		 	키보드 : 1 입력하면, 출력 : 1값은 4번쩨 위치입니다.
		 	키보드 : -3 입력하면, 출력 : -3값은 2번째 위치입니다. 
		 	
		 	* 반복문, 조건문 이용
		 */
		
		int index = -1;
		System.out.println("찾을 숫자를 입력>>");
		int numC = sc.nextInt();
		int i=0; // 블럭 밖에서도 쓰기위해서 for문 안에서 꺼내옴
		
		for( ; i<7; i++)	{
			if(numC == student[i]) {
				index = i; 
				break;
			}
		}
		
		if(index ==-1) // -1이 아니니 ?
			System.out.printf("%d값은 찾을 수 없습니다.\n", numC);
		else
			System.out.printf("%d값은 %d번째 위치입니다. %d\n", 
					numC, index+1, i);
		
		
		System.out.println("-------------------------------------");
		
		/*
		 * {10, -3, -700, 1, 2, 9, 3}
		 * 
		 * 정렬(sort)해서 출력하기....{-700, -3, 1, 2, 3, 9, 10}
		 */
		
	}
	
		
}
