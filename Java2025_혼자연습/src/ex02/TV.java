package ex02;

public class TV {

	private String model;
	private int size;
	private int channel;
	
	public int getChannel() { //상위클래스는 하위클래스 참조할 수 있으니까 
		return channel;
	}
	
	public String getModel() { 
		return model;
	}
	
	public int getSize() {
		return size;
	}
	
	public TV() {}
	
	public TV(String model, int size, int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	}

	// channel 변수의 값을 1 증가시킴, 10 보다 커지면 1 로 설정한다. 	
	public void channelUp() {
		
		channel = channel > 10 ? 1 : channel++; //삼항연산자 
//		if(channel > 10) {
//			channel = 1;
//		}
//		channel++; 
	}
	
	//channel 변수의 값을 1 감소시킴, 1보다 작아지면 10으로 설정한다.
	public  void chnnelDown() {
		
		channel = channel < 1 ? 10 : channel--; //삼항연산자 
		
//		if(channel < 1) {
//			channel = 10;
//		}
//		channel--;
	}



	public void play() { // 아규먼트로 전달된 객체의 play() 를 호출한다. -> 이렇게 때문에 play를 추가해줌 (상위클래스는 하위클래스의 자원을 쓸 수 없음. 객체를 쓰려면 반드시 재정의를 해야함)
						// 이렇게 쓰면 간단하지만 형변환으로 쓸 것  
		
	}


}	
	
	