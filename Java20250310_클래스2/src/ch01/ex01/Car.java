package ch01.ex01;

public class Car {
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	public Car() {
//		this.company = "현대"; 
//		this.model = "그랜저";
//		this.color = "검정";
//		this.maxSpeed = 250;
		this("현대", "그랜저", "검정", 250);
	} 
	
	public Car(String company, String model) {
//		this.company = company; 
//		this.model = model;
//		this.color = "검정";
//		this.maxSpeed = 250;
		this(company, model, "검정", 250);
	}
	
	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company; // 그냥 company라고 하면바로윗줄에 있는 company라서 this.를 꼭 붙여줘야함
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public void run() {
		System.out.println(company + "달린다.");
	}
	
	public void displayInfo() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println(maxSpeed);
	}
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
