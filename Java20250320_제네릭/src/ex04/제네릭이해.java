package ex04;

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
		
//		Apple ap = (Apple)aBox.getObj();  
//		Orange op = (Orange)oBox.getObj();  
		
		System.out.println(aBox.getObj()); //43,44에 실수로 문자열을 넣으면 
		System.out.println(oBox.getObj());
		
	}

}
