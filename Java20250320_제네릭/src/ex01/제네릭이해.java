package ex01;

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


class appleBox{
	private Apple ap;

	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) {
		this.ap = ap;
	}
}


class orangeBox{
	private Orange op;

	public Orange getOp() {
		return op;
	}

	public void setOp(Orange op) {
		this.op = op;
	}
	
}

public class 제네릭이해 {

	public static void main(String[] args) {
		
		appleBox aBox = new appleBox(); //사과클래스만 담는다 
		orangeBox oBox = new orangeBox(); //오렌지클래스만 담는다 
		
		aBox.setAp(new Apple()); //사과박스에 사과 담기  // setter써서 객체 생성 
		oBox.setOp(new Orange()); //오렌지박스에 오렌지 담기 
//		aBox.setAp(new Orange()); //오렌지랑 사과는 타입이 달라서 받아줄 수가 없음. 단, 상속관계면 가능 
									//타입 안전성
		Apple ap = aBox.getAp();
		System.out.println(ap);
		
		Orange op = oBox.getOp();
		System.out.println(op);
	}

}
