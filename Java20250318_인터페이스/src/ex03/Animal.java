package ex03;

public interface Animal {
	void sound();
	void eat();
}

class Dog implements Animal { //Dog는 eat()메소드를 구현하지 않으므로 abstract로 만들었음 
	public void sound() {
		System.out.println("멍멍");
	}
	
	public void eat() {
		System.out.println("강아지가 먹는다");
	}
}

class Cat implements Animal {
	public void sound() {
		System.out.println("야옹");
	}
	public void eat() {
		System.out.println("고양이가 먹는다.");
	}
}

class Lion implements Animal {
	public void sound() {
		System.out.println("어흥");
	}
	public void eat() {
		System.out.println("사자가 먹는다");
	}
}
