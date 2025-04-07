package ex02;

public class TVTest {

	public static void main(String[] args) {

		SaleTV s1 = new SaleTV();
		RentalTV r1 = new RentalTV();
		
		printAllTV(s1);
		printAllTV(r1);
		
		s1.channelUp();
		r1.channelUp();
		
		
		
		s1.chnnerlDown();
		r1.chnnerlDown();
		
	}

	private static void printAllTV(TV tv) {
		System.out.println();
	}
	
	private static void printRentalTV(Rentable tv) {
		System.out.println();
	}
	
	
	


}
