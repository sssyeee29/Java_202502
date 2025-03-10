package ch01.ex01;

public class MainCar {

	public static void main(String[] args) {
		
		Car car = new Car();//10번이랑 같아짐, 인자값이 없으면 객체를 지우는게 나음
		car.displayInfo(); // 이렇게하면 네개 다 찍어줌
		System.out.println();
		
		Car car2 = new Car("기아", "K8", "흰색", 200);
		car2.displayInfo();
		System.out.println();
		
		Car car3 = new Car("현대", "소나타");
		car3.setColor("흰색");
		System.out.println(car3.getCompany());
		car3.displayInfo();
		
		System.out.println();
		
	}

}
