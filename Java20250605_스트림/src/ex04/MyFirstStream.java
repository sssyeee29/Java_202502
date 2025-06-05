package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class MyFirstStream {

	public static void main(String[] args) {
		
		List<ToyPriceInfo> list = new ArrayList<ToyPriceInfo>();
		
		list.add(new ToyPriceInfo("GUN", 2000));
		list.add(new ToyPriceInfo("CAR", 5000));
		list.add(new ToyPriceInfo("TEDDy", 3000));
		list.add(new ToyPriceInfo("SHIP", 7000));
		
		//가격 출력
		list.stream()
			.mapToInt(n->n.getPrice())
			.sorted() //흘러들어온 가격을 정렬을 해줌, 기본 내림차순 
			.forEach(n-> System.out.print(n)); //n은 가격만 들어있는 숫자 
		System.out.println();
		
		
		//가격 합 출력
		int sum = list.stream()
				.mapToInt(price->price.getPrice())
				.sum();
		System.out.println("총합 : " + sum);
		
		
		//가격 5000이상만 출력
		int total = list.stream()
					.filter(price-> price.getPrice()>=5000)
					.mapToInt(price->price.getPrice())
					.sum();
		System.out.println("5000원 이상 가격 합 : " + total);
		
		//가격이 5000이상인 모델 출력 
		System.out.print("5000원 이상 상품명 : " );
		list.stream()
			.filter(price-> price.getPrice()>=5000)
			.forEach(p-> System.out.print(p.getModel() + " "));
		
		
		
		
		
	}

}