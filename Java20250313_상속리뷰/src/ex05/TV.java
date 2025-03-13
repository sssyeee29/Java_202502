package ex05;

/*
 * 클래스 내부에 추상클래스가 1개 이상 
 * 존재하면 그 클래스는 '추상클래스' // 추상클래스 => 비완성클래스라고 부름 그래서 객체 생성이 안됨. but, 참조는 가능함 
 * 추상메소드가 반드시 1개이상 존재 - 추상메소드란? {}이 없는 메소드(바디라고 부름)
 * 추상클래스 안에 일반메소드가 존재할 수 있다. (abstract이 붙지 않은 일반메소드)
 * 클래스안에 있는 메소드가 있는데 상속해가는애가 반드시 재정의 해야하면 추상클래스로 만들면 됨 - 강제화할거면 추상클래스로 하고 아님 안만들어도됨 
 */
public abstract class TV {
	
	boolean power;

	TV() {
		power = false;
	}
	
	//추상메소드 --> {}가 없다. // 앞에 abstract을 붙여주면 추상메소드! 
	//추상클래스를 상속해가면 {}를 만들어넣어야함 (즉, 하위클래스가 !무조건! {}를 완성해서 써야함 - 강제화)
	//뼈대만 만들어주니까 바디를 채워넣어라..
	abstract void powerOn();
	
	abstract void powerOff(); 
	
	abstract void volumeUp();
	
	abstract void volumeDown();
	
	void test() {} // abstract이 붙지 않은것은 재정의 해도되고 안해도 됨.
}
	
