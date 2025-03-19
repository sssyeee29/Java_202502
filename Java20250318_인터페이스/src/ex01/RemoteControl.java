package ex01;

public interface RemoteControl {
	/*인터페이스는 틀만 제공해줌
	새로운 기능을 집어넣고 싶으면 기존에 쓰던게 죽어버린다...
	-> 어떻게 해결할건가 HOW? 
	1.선택사항을 준다(구현할래? 구현 안할래?)
	2.새로운 메소드를 추가할 때 앞에 default를 붙여주면됨 (일반클래스에는 적을 수 없음)
	ex) default void func() 이런식으로 
	*/
	
//	public static final : 9번처럼 쓰면 앞에 이것들이 생략되어있다. default값 
	static final int MAX_VOLUME = 10; //interface 상수, final인걸 직관적으로 알기위해서 직관적으로 대문자로 쓴 것 
	int MIN_VOLUME = 0;	//interface 상수, 앞에 static final이 생략되어있음 
	/*
	 * interface 상수 
	 * 멤버변수 생성 불가 
	 * 정적변수만 생성 가능 
	 */
	
	//16번은 추상메소드, 일반 메소드 올 수 없음 
	public void turnOn();
	
	//밑에 두개 메소드를 추가하면, Television이랑 Radio 구현해줘야함 (아니면 오류남)
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드 : 재정의 하거나, 안하거나 알아서 하라고 옵션을 줌 
	default void 신기능() {
		
	}
	
}
