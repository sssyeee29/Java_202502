package ex02;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("데이터갯수>>");
		int count = sc.nextInt();

		int[] nArr = new int[count];
		
		for(int i=0; i<nArr.length; i++) {
			System.out.println("정수입력>>");
			nArr[i] = sc.nextInt(); //0번째부터 값을 받게 될 것, 총5회 
		}
		
		for(int i=0; i<nArr.length; i++) {
			System.out.print(nArr[i] + ", ");
		}
		System.out.println();
		
		GradeExpr expr = new GradeExpr(nArr);
		
		System.out.println("총점 : " + expr.getTotal());
//		System.out.println("평균 : " + expr.getAverage()); // 이렇게 써도되는데 소수점 자리가 너무 많이 나와서 .. 아래꺼로 바꿈
		System.out.printf("평균 : %.2f\n", + expr.getAverage());
		System.out.println("최고점수 : " + expr.getGoodScore());
		System.out.println("최저점수 : " + expr.getBadScore());
	}

}
