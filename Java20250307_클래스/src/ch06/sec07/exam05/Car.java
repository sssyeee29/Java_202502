package ch06.sec07.exam05;

/*
 * 1. brand(브랜드), model(모델명), year(연식)을 필드로 가짐
 * 2. 생성자를 통해 brand, model, year를 설정할 수 있음.
 * 3. startEngine() 메서드를 구현하여 "[brand][model]의 엔진이 시작되었습니다!"를 출력하도록 함.
 * 4. displayInfo() 메서드를 구현하여 "자동차 정보 : [year]년식 [brand][model]"을 출력하도록 함
 * 5. main 메서드에서 Car 객체를 생성하고 startEngine()과 displayInfo()를 호출하여 실행 결과를 확인할 것 
 */
public class Car {

	private String brand;
	private String model;
	private String year;
	
	Car() {
		brand = "기아";
		model = "K8";
		year = "2024";
		
	}
	
	Car(String brand) {
		this.brand = brand;
		model = "그랜저";
		year = "2025";
	}
	
	Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
		year = "2025";
	}
	Car(String brand, String model, String year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	void startEngine() {
//		System.out.println("[" + brand + "] [" + model + "]의 엔진이 시작되었습니다!");
		System.out.printf("[%s] [%s]의 엔진이 시작되었습니다!\n", brand, model);
	}
	
	void displayInfo() {
		System.out.println("[" + year + "]년식 [" + brand + "] [" + model + "]");
	}
}
