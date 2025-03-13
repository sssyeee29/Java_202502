package ex07;

import java.text.DecimalFormat;

public class Product {
	
	private String name;
	private int balance;
	private int price;
	
	Product() {	// 초기화 하는거니까 여기 기본값에 넣어서 초기화해줌 
		this("듀크인형", 5, 10000);
	}
	
	Product(String name, int balance, int price){
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	
	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#,###"); // 천단위로 하라는것 
		
		return name + " " + balance + " " +formatter.format(price) + "원";
//		return name + " " + balance + " " + price + " " + "원";
	}

	public String getName() {
		return name;
	}
	
	public int getBalance()  {
		return balance;
	}
	
	public int getPrice () {
		return price;
	}
	
}
