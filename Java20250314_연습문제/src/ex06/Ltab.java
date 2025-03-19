package ex06;

public class Ltab extends Mobile {

	
	public Ltab() {}
	
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize,osType);
	}
	
	@Override
	public void operate (int time) {
		//사용을 통해 배터리 감소 구현
		// 1분 사용 시 배터리 10감소
		int size = getBatterySize(); //500
		size += time*-10; //size = 500 + -10*10
		setBatterySize(size);
	}
	
	@Override
	public void charge (int time) {
		//충전을 통해 배터리 증가 구현
		//1분 충전 시 배터리 10증가 
		int size = getBatterySize(); // 500을 읽어와서 다음 과정 실행 
		size += time*10;
		setBatterySize(size);
		
	}


}
