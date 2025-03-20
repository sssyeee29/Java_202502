package ex09;

/*
 * 제네릭 메소드 
 */


class Box<T> {
	private T obj;
	
	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
}

class BoxFactory{
	/*
	 * <T> : 제네릭 메소드 표시, Box<T> : 반환타입, T o : 매개변수 
	 * makeBox : Box를 생성한다 
	 */
	public static <T> Box<T> makeBox(T o) { //T는 메서드 호출 시 결정됨, o는 "Sweet"랑 7.58
		Box<T> box = new Box<>();
		box.setObj(o);
		return box;
	}
	
	/*	47번을 출력하면 이렇게 일단 수정이되고 다음과정 수행 
		public static <Double> Box<Double> makeBox(Double o) {  //여기서 double o가 
		Box<Double> box = new Box<>();
		box.setObj(o);
		return box;
	 * 
	 */
}

public class 제네릭이해 {

	public static void main(String[] args) {
		Box<String> sbox = BoxFactory.makeBox("Sweet");
		System.out.println(sbox.getObj()); // 이거를 찍어주면 classfactory에서 String타잉으로 바뀐 정적메소드가 생기고 여기에 "sweet"이 생김 
		
		Box<Double> dbox = BoxFactory.makeBox(7.58);
		System.out.println(dbox.getObj()); //obj는 리턴시키고있음..
	
		
	}

}


/*
 * 실행순서 
 * 	1.main 메서드 시작
	2.BoxFactory.makeBox("Sweet") 호출 → Box<String> 생성 → "Sweet" 저장 → 반환
	3.sbox.getObj() 호출 → "Sweet" 출력
	4.BoxFactory.makeBox(7.58) 호출 → Box<Double> 생성 → 7.58 저장 → 반환
	5.dbox.getObj() 호출 → 7.58 출력
 * 
 * 
 * 
 * 1. main 메서드 실행 -> BoxFactory.makeBox("Sweet") 가 호출된다.
 * 2. BoxFactory.makeBox("Sweet") 호출 (첫 번째 호출) -> BoxFatory 클래스의 makeBox 메서드 호출 
 * -> T는 String으로 추론(T는 메서드 호출 시 결정됨), "Sweet"는 String 타입이라서 T가 String으로 바뀜 
 * -> makeBox("Sweet")에서 "Sweet"를 매개변수로 받아서 Box<String> 타입의 객체를 생성
 * 3. Box<String> 타입의 box 객체가 생성됨 -> box.setObj("Sweet")를 호출하여, box 객체에 "Sweet" 값을 저장
 * -> box 객체가 반환되어 sbox 변수에 할당
 * 4.sbox.getObj()를 호출하면 Box<String> 객체에 저장된 "Sweet" 값을 반환 -> "Sweet"값이 출력
 * 5. BoxFactory.makeBox(7.58)가 호출 -> T는 Double 타입으로 설정 -> makeBox(7.58)에서 7.58을 매개변수로 받아 Box<Double> 타입의 객체를 생성
 * 6. Box<Double>타입의 box 객체 생성 -> box.setObj(7.58)를 호출하여, box 객체에 7.58 값을 저장
 * -> box 객체가 반환되어 dbox 변수에 할당
 * 7. System.out.println(dbox.getObj()) -> dbox.getObj()를 호출하면 Box<Double> 객체에 저장된 7.58 값을 반환 ->7.58출력 
 */































