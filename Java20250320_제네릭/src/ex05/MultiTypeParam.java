package ex05;

class DBox<L,R> {
	private L left;
	private R right;
	
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
}

class Person {}

public class MultiTypeParam {

	public static void main(String[] args) {

		DBox<String, Integer> iBox = new DBox<String, Integer>(); // 타입을 제한했다. 
		
		iBox.set("홍길동", 20);
		
		System.out.println(iBox);
	
		DBox<Person, String> pBox = new DBox<>(); // 새로운걸 만들고 싶으면 해당 클래스 무조건 추가해주기 
		Person p = new Person();
		pBox.set(p, "AAA");
		
		
		
	}

}
