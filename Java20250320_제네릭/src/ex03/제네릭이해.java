package ex03;

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


class Box{
	private Object obj; // object는 뭐든 다 받아줌(어떤 타입이든)

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}



public class 제네릭이해 {

	public static void main(String[] args) {
		
		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.setObj("new Apple()");
		oBox.setObj("new Orange()");
		
		Apple ap = (Apple)aBox.getObj(); // error 발생 43번에서 ""를 써서 문자열로 만들면 여기에서 오류가 남. 타입은 String이니까 
		Orange op = (Orange)oBox.getObj(); // error 발생 
		
		System.out.println(ap);
		System.out.println(op);
		
	}

}
