package ex04;

/*
 * 멤버이너클래스 생성
 * ex03이랑 다른점 : SendMessage 클래스를 Network 클래스 안에 넣어서 코드입력함
 * -> SendMessage클래스를 밖에서 안쓰니까 굳이 노출 안시키고 안에 가져옴
 */

class Network{
	
	public void message(String content) {
		
		SendMessage message = new SendMessage(content);
		
		System.out.println(message.getMsg());
	}
	
	class SendMessage{
		private String msg;

		public SendMessage(String msg) {
			this.msg = msg;
		}
		
		String getMsg() { 
			return msg;}
	}
}

public class MemberInnerClass {

	public static void main(String[] args) {
		
		Network network = new Network();
		network.message("이 문장을 전송해 주세요!!!");
	}
}
