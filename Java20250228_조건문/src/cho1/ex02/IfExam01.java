package cho1.ex02;

public class IfExam01 {

	public static void main(String[] args) {
	
		/*
		 * 조건문
		 * 1. if
		 * 2. if ~ else  조건 만족하면 if / 조건 만족 안하면 else 뒤에꺼가 나옴
		 * 3. if ~ else if ~ else / 무한대, 이거를 직관적으로 보기위해서 만든게 switch문(다는 안돼도 몇가지는 됨)
		 * 
		 * switch 문 => if문으로 바꾸기 가능 반대로, switch문을 if문으로 받는거엔 한계가 있음
		 */
		
		int kor = 80;
		
		//int eng = 80;
		
		
		if(kor >= 70) {   // 중괄호 안에 있는 70이상이면, 이라는 조건을 만족하면 실행함, 아니면 실행X
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		{
		
		//if(kor < 70) { // 18번 조건에 맞지 않아서 실행하지않고 그냥 빠져나온 후 여기에 다시 입력해서 실행
			//System.out.println("불합격");
		
		System.out.println("종료");
		}
	}
}

