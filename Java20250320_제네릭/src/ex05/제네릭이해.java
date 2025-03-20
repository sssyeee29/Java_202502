package ex05;

import lombok.Getter;
import lombok.Setter;

class Apple{
	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class Orange{
	@Override
	public String toString() {
		return "I am an orange.";
	}
}


class Box<T> { 
	private T obj; // object는 뭐든 다 받아줌(어떤 타입이든)

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}



public class 제네릭이해 {

	public static void main(String[] args) {
		
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		aBox.setObj(new Apple()); //다른값을 절대 못 집어넣음. 무조건 new Apple()만 가능 
		oBox.setObj(new Orange());//다른값을 절대 못 집어넣음. 무조건 new Orange()만 가능
		
		Apple ap = aBox.getObj();
		Orange op = oBox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
		
		Box<String> sBox = new Box<String>(); // String 타입만 넣으라는 것, 다른거 넣으면 오류남 (다른거 절대 못넣음)
		sBox.setObj("AAAAAAA");				//이렇게 <>안에 적어주고 나면 그때 바로바로 새로운 클래스가 생기는 개념 
		
	}

}
