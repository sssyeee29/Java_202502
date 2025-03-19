package ex06;

public abstract class Mobile {

	private String mobileName;
	private int batterySize;
	private String osType;
	
	public Mobile() {	}
	
	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	/*
	 * 추상메소드 => Mobile을 상속하는 객체는 반드시 추상메소드를 재정의해서 사용해라
	 * 추상클래스 => 객체 생성할 수 없다. 
	 */
	
	public abstract void operate(int time); // 이렇게 쓰면 가져가서 쓸 때 반드시 재정의해라.(강제)
	public abstract void charge(int time);	// 다른클래스 만들대 무조건 abstract 써져있는 메소드 가져가기
	

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
	
	
}
