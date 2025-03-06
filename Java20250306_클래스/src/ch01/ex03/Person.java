package ch01.ex03;

// 클래스명 -> 첫글자 대문자
public class Person {

	// 필드, 인스턴스 변수 
	private String name;
	private String phone;
	int age;
	
	
	/*생성자
	 * 생성자 : 값 초기화 // 생성자를 만드는 이유는 값을 초기화하기위함, 이걸 안쓰면 값을 직접 대입 못함
	 */
	public Person(String n, int a, String p) {
		name = n;
		age = a;
		phone = p;
	}
	
	//디폴트 생성자 : 인자값이 아무것도 없는거 
	public Person() {
		System.out.println("void Person()");
	}
	
	// 메소드, 인스턴스 메소드
	void 나이출력() {
		System.out.println("나이 : " + age);
	}
	void 전화번호출력() {
		System.out.println("전화번호 : " + phone);
	}
	void 이름출력() {
		System.out.println("이륾은 : " + name);
		
	}
	
}
