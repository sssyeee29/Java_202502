package ex01;
/*
 * A < B < C
 */
public class RemoteTest {

	public static void main(String[] args) {
		RemoteControl remote = new Radio(); //RemoteControl자리에 클래스 이름이 직관적으로 이게 오는게 이상적 

		remote.turnOn();
		
		System.out.println(RemoteControl.MAX_VOLUME); // static이라 객체생성안하고가능
		System.out.println(RemoteControl.MIN_VOLUME); 
		
	}

}
