package ex10;


class Box<T> {
	private T obj;
	
	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	@Override
	public String toString() {
		return (String)obj;
	}
}

class A{}
class B extends A{}
class C extends B{}
class D extends C{}


class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.getObj();
	}
	public static void peekBos(Box<?> box) {
		System.out.println(box);
	}
	//						super=>읽기전용, 쓰기금지 : 상한 제한 :B부터 D까지 (즉, B아래 하위클래스까지만 대입가능)
	public static void peekBox(Box<? extends B>box) {//?도 T랑비슷
		System.out.println(box);
		box.getObj();//읽는건getter
//		box.setObj(box); => 이렇게 쓰는건 안됨 오류남 
	}
	//						extends=>쓰기전용, 읽기금지 : 하한 제한  : B아래로는 대입하지마라.// B는 가능 (즉, 위에 상속클래스만 대입가능)
	public static void peekBox2(Box<? super B> box) {
		System.out.println(box);
	}
}

public class WildcardExam01 {

	public static void main(String[] args) {
		
		Box<A> box = new Box<>(); //B,C,D 올 수 있음.ㅣ
		box.setObj(new B());
		
	//	Unboxer.peekBox(box);
	}

}
