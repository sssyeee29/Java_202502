package ex06;

public class MobileTest {

	public static void main(String[] args) {
	
		// 각각의 Mobile 객체를 생성한다.
//		Mobile mobile = new Mobile(); //abstract은 void부분에 바디가 없어서 이렇게 생성 불가능(참조는 가능)
		Mobile ltab = new Ltab("Ltab", 500, "ABC=01");
		Mobile otab = new Otab("Otab", 1000, "XYZ-20");
		
		// 생성된 객체의 정보를 출력한다.(printMobile() 호출)
		printTitle();
		printMobile(ltab);
		printMobile(otab);
		System.out.println();
		
		//각각의 Mobile 객체에 10분씩 충전을 한다.
		ltab.charge(10);
		otab.charge(10);
		
		//10분 충전 후 객체 정보를 출력한다.(printMobile(); 호출)
		System.out.println("[10분 충전]");
		printTitle();
		printMobile(ltab);
		printMobile(otab);
		System.out.println();
		
		//각각의 Mobile 객체에 5분씩 충전을 한다.
		ltab.operate(5);
		otab.operate(5);
		//5분 통화 후 객체 정보를 출력한다(printMobile(); 호출)
		System.out.println("[5분 통화]");
		printTitle();
		printMobile(ltab);
		printMobile(otab);
		System.out.println();
		
	}
	
	//Mobile mobile= ltab;
	//Mobile mobile= otab;
	public static void printMobile(Mobile mobile) {//객체생성 안하고 바로 실행시키겠다는 의미
		System.out.println(mobile.getMobileName() + "\t\t" 
							+ mobile.getBatterySize() + "\t\t" + mobile.getOsType());
		
	}
	
	
	public static void printTitle() {
		System.out.println("Mobile\t\tBattery\t\tOS");
		System.out.println("-----------------------------------");
	}

}
