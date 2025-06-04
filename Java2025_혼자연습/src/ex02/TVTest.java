package ex02;

public class TVTest {

	public static void main(String[] args) {

		//SaleTV, RentalTV 클래스의 객체를 각각 생성한다.
		TV saleTV = new SaleTV("SALETV-1", 40, 1, 300000);
		TV RentalTV = new RentalTV("RENTALTV-1", 42, 1, 100000);
		
		//SaleTV 객체는 채널을 두 개 높인다. 
		saleTV.channelUp();
		saleTV.channelUp();
		
		//RentalTV 객체는 채널을 세 개 내린다. 
		RentalTV.chnnelDown();
		RentalTV.chnnelDown();
		RentalTV.chnnelDown();
		
		printAllTV(saleTV);
		printAllTV(RentalTV);
				
	}
	
	static void printAllTV(TV tv) {
		System.out.println(tv.toString()); //object에 있어서 사용가능 
		tv.play();
		
	}
	
	
	


}
