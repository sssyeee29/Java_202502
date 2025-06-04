package ex02;

public class RentalTV extends TV implements Rentable{

	private int price;
	
	public RentalTV() {}
	
	public RentalTV(String model, int size, int channel, int price) {
		super(model, size, channel);
		this.price = price;
	}
	
	public void play() {
		System.out.printf("대여 TV 채널" + getChannel() + "번의 프로를 플레이 합니다.");
	}
	
	@Override
	public void rent() {
		System.out.println(getModel()+ "모델의 상품을 대여합니다." + price + "를 지불해주세요.");		
	}

	@Override
	public String toString() {
		return String.format("대여상품정보 : 모델명(%s), 가격(%,d원), 크기(%d)", getModel(), price, getSize()); 
		
	}

}	
	
