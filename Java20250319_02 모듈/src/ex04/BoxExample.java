package ex04;

public class BoxExample {

	public static void main(String[] args) {

//		int i = 100; // 기본자료형 // 박싱  
//		Integer obj = 100;
//		
//		int num = obj; // 언박싱
		
		
		int i = 10;
		int j = 5;
		int k = 20;
		
		int max = Math.max(Math.max(i, j), k); //3개의 최대값 구할 때 if문 안쓰고 이렇게도 가능 
		
		System.out.println(max);
		
	}

}
