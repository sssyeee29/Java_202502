package cho1.ex02;

public class IfExam03 {

	public static void main(String[] args) {
	
		
		 int korScore = 80;
		 
		 if(korScore >= 80) {
			 System.out.println("상");
			
		 }else {
			 if(korScore >= 60) {
				 System.out.println("중");
			 }else {
				 System.out.println("하"); // 거짓이면 마지막에 이렇게 조건 하나 더 적어줘야함, 이것도 거짓이면 또 조건추가해줌			 }
		 }
	 }
		
		System.out.println("종료");
  
	}
}

 
