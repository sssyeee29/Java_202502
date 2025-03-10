package ch01.ex03;

public class MainCar {
	
	int speed;
	
	void run() {
		speed = 100;
	}
	public static void main(String[] args) {
		
	MainCar car = new MainCar(); 
	car.speed = 100; 
	
	
	//	speed = 100; // 이렇게 메인 메소드에서 쓸 수 없고 반드시 객체 생성 후  
		
	}

}
