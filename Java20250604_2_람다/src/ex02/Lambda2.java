package ex02;

interface Printable{
	void print(String msg);
}
/*
class Printer implements Printable{

	@Override
	public void print(String msg) {
		System.out.println(msg);
	}	
}
*/

public class Lambda2 {

	public static void main(String[] args) {

		Printable p = new Printable() { //위처럼 클래스 만들어서 하지않고 람다식으로 써서
			@Override					//한번에 같이 써줬다 
			public void print(String msg) {
				System.out.println(msg);
			}
		};
		
		p.print("이 문장 출력 요망2!!");
	}

}