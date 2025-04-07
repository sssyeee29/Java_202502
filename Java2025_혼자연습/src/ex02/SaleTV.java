package ex02;

public class SaleTV extends TV{
	
	private int price;
	
	public SaleTV() {}
	
	public SaleTV(String model, int size, int channel, int price) {
		super(model, size, channel);
		this.price = price;
	}
	
	@Override
	public void channelUp() {
		
	}
	
	public void play() {
		
	}
	
	public void sale() {
		
	}
	
	public String toString() {
		return null;
		
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
