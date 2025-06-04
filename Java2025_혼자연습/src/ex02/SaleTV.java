package ex02;

public class SaleTV extends TV{
	
	private int price;
	
	public SaleTV() {}
	
	public SaleTV(String model, int size, int channel, int price) {
		super(model, size, channel);
		this.price = price;
	}
	
	
	public void play() {
		System.out.println("판매 TV 채널" + getChannel() + "번의 프로를 플레이 합니다.");
	}
	
	public void sale() {
		System.out.println(getModel()+ "모델의 상품을 판매합니다." + price + "를 지불해주세요.");
	}
	
	@Override
	public String toString() {
		return String.format("판매상품정보 : 모델명(%s), 가격(%,d원), 크기(%d)", getModel(), price, getSize()); //굳이 format 안써도 되는데 가격에서 천단위 맞추려고 넣은것 같다고,,
		
	}
	
	

	
}
