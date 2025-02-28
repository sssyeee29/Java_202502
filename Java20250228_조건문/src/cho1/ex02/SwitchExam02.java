package cho1.ex02;

public class SwitchExam02 {

	public static void main(String[] args) {
	
		/* (Ifcase05를 바꾼것)
		 * 학점(grade)
		 * 90 : A
		 * 80 : B
		 * 70 : c
		 * 60 : D
		 * 59이하 : F
		 */
		 
		int grade = 85;
		
		switch(grade/10) { // 10으로 나누면  앞에 몫만 남기고 계산
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			
		}
		
		System.out.println("종료");
  
	}
}

 
