package ex02;

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


class Box{ // Apple이랑 Orange 둘 다 똑같이 수행해야해서 공통으로 쓸 수 있는 Object로 통합시켜서 같이 씀 
	private Object obj;

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
		
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
		
		Apple ap = (Apple)aBox.getObj(); // 반환타입이 Object라서 Apple로 형변환해줘야함 
		Orange op = (Orange)oBox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
		
	}

}
