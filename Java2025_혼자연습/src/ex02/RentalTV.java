package ex02;

public class RentalTV extends TV implements Rentable{

	private int price;
	
	public RentalTV() {}
	
	public RentalTV(String model, int size, int channel, int price) {
		super(model, size, channel);
		this.price = price;
	}
	
	public void play() {
		
	}
	
	public void sale() {
		
	}
	
	public String toString() {
		return null;
		
	}

	@Override
	public void rent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void channelUp(int volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void channelDown(int volume) {
		// TODO Auto-generated method stub
		
	}
}
