package cho1.ex02;

public class IfExam04 {

	public static void main(String[] args) {
	
		/*
		 * 학점(grade)
		 * 90 : A
		 * 80 : B
		 * 70 : c
		 * 60 : D
		 * 59이하 : F
		 */
		 
		int grade = 55;
		
		if(grade >= 90) {
			System.out.println("A");
		}else {
			if(grade >= 80) {
				System.out.println("B");
			}else {
				if(grade >= 70) {
					System.out.println("C");
				}else {
					if(grade >= 60) {
						System.out.println("D");
					}else {
						System.out.println("F");
					}
				}
			}
		}
	
		System.out.println("종료");
  
	}
}

 
