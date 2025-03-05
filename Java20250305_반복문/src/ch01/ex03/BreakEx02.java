package ch01.ex03;

public class BreakEx02 {

	public static void main(String[] args) {

		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("* ");
				
				if(i == j) break; // break는 본인이 포함된 중첩문만 벗어나서 다음 단계를 실행함 
			}
			System.out.println();
		}
	}

}
