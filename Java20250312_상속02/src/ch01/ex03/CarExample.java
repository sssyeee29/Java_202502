package ch01.ex03;//5번

public class CarExample {

	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		
//		myCar.run();
		
		//Tire 객체 장착
		myCar.tire = new Tire();
		myCar.run();
		
		//HankookTire 객체 장착
		myCar.tire = new HankookTire();        
		myCar.run();
		
		//KumhoTire 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();
		
	}

}
