package ex04;

public class FriendTest {

	public static void main(String[] args) {
	
		Friend[] friends = new Friend[5];
		
		friends[0] = new Friend("홍길동", "010.1111.2222", "aaa@naver.com");
		friends[1] = new Friend("홍길은", "010.2222.3333", "bbb@naver.com");
		friends[2] = new Friend("홍길금", "010.3333.4444", "ccc@naver.com");
		friends[3] = new Friend("홍동길", "010.4444.5555", "ddd@naver.com");
		friends[4] = new Friend("홍동은", "010.5555.6666", "eee@naver.com");
		
		System.out.println("이름\t전화번호\t메일주소");
		for(int i=0; i<friends.length; i++) {
			System.out.println(friends[i].getlnfo());
//			String result = friend[i].getlnfo();
//			System.out.println(result);
		}
	}
	
	

}
