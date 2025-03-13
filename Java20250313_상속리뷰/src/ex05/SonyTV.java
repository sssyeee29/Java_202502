package ex05;

public class SonyTV extends TV{
	
	@Override
	void powerOn() {
		System.out.println("SonyTV.");
		System.out.println("전원 on");
	}
	void powerOff() {
		System.out.println("SonyTV.");
		System.out.println("전원 off");
	}	   
	void volumeUp() {
		System.out.println("SonyTV.");
		System.out.println("볼륨 up");
	}
	void volumeDown() {
		System.out.println("SonyTV.");
		System.out.println("볼륨 down");
    } 
	  
}
