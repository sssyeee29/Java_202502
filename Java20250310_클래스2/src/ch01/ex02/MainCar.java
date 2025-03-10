package ch01.ex02;

import java.util.Random;

public class MainCar {

	public static void main(String[] args) {

		// 정적 메소드를 객체 생성하지 않고
		// 클래스명, 정적메소드명 실행가능
		// 클래스명, 정적변수명 실행가능

		Car.runState();
		System.out.println(Car.companyState);
		
// 밑에 car1 ~ car5 만들어보고 하느냐고 여기 주석처리한거 		
 /*
		Car car1 = new Car(); 
		car1.displayInfo();
		Car.runState();
//		car1.runState(); // 이렇게 쓰는건 좋지 않음, 필요할땐 17번처럼 쓰면 됨
		System.out.println();
		  
		Car car2 = new Car("기아", "K8", "흰색", 200); 
		car2.displayInfo();
		car2.runState(); 
		System.out.println();
		
		Random random = new Random();
		int num1 = (int)(random.nextInt()*45)+1; //인스턴스 메소드 
		
		int num2 = (int)(Math.random()*45)+1; // 정적메소드 */
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();
		Car car5 = new Car();
	}

}
