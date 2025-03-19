package ex01;

public class Television implements RemoteControl{
	
	@Override // RemoteControl에 있는 메소드를 구현한것 
	public void turnOn() { 
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
}
