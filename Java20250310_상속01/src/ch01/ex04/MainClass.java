package ch01.ex04;

class GrandParent{
	private String 할아버지성함;
	
	GrandParent(String 할아버지성함) {
		this.할아버지성함 = 할아버지성함;
		
	}
	void displayInfo() {
		System.out.println("할아버지 성함은 " + 할아버지성함);
	}
	
	
} 

class Parent extends GrandParent{
	private int 아버지연세;
	
	
	Parent(String 할아버지성함, int 아버지연세){
		super(할아버지성함); //상위클래스 생성자 호출(인자값 1개 받을 수 있는)
		this.아버지연세 = 아버지연세;
	
	}
	
	void displayInfo() {
		super.displayInfo();
		System.out.println("아버지 연세는 " + 아버지연세);
	}
}

class Child extends Parent{
	String 나의취미;
	

	public Child(String 할아버지성함, int 아버지연세, String 나의취미){
		super(할아버지성함, 아버지연세); //상위클래스 생성자 호출(인자값 2개 받을 수 있는)
		this.나의취미 = 나의취미;	 
	}
	
	void displayInfo() { // 함수 오버라이딩 : 똑같은게 여러 클래스에 있음 
//		super.displayInfo();
		System.out.println("나의 취미는 " + 나의취미);
	}
	
	
}
public class MainClass {

	public static void main(String[] args) {

		Child child = new Child("김철수", 50, "야구");
		child.displayInfo(); // 세군데에 다 가지고 있으면 본인꺼를 먼저 출력함 
		
		/*
		 * 할아버지 성함은 김철수
		 * 아버지 연세는 50
		 * 나의 취미는 야구 
		 */
	Parent p1 = new Parent("홍길동", 100);
	p1.displayInfo();
		
		
	}

}
