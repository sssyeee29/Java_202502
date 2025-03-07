package ch06.sec07.exam05;

public class MainCar {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.displayInfo();
		
		Car car2 = new Car("현대");
		car2.displayInfo();
		
		Car car3 = new Car("기아", "K9");
		car3.displayInfo();
		
		
		Car car = new Car("기아자동차", "K8", "2023");
		
		car.startEngine();
		
		car.displayInfo();
		
		
	}

}
