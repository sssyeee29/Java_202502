package ex01;

public class Exam01 {

	public static void main(String[] args) {
		
		//문자열 비교 : 문자열 리터럴이 동일하면 String 객체를 공유하도록 설계되어있음 
		//new String을 붙여주면 새로운 객체를 만들 수 있다. 
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = new String("홍길동");
		
		//문자열 대체 : 특정 문자열을 다른 문자열로 대체하고 싶으면 replace() 메소드 사용 
		String old1 = "자바 프로그래밍";
		String new2 = old1.replace("자수", "JAVA"); // 없는 글씨를 쓰면 없는거라서 오류가 남 -> 다시 수정한 문자가 출력안됨 // 대체한 새로운 문자열 리턴 
												 
		System.out.println(new2);
		System.out.println(old1);
		
		//문자열 찾기 : 특정 문자열의 위치를 찾고자 할 때 indexof() 메소드 사용 
		String str = "koreakorea";
		System.out.println(str.indexOf('k')); // 두 단어가 조합되면 앞에꺼부터 나옴 (맨앞)
		System.out.println(str.lastIndexOf('r')); //last를 붙이면 뒤에서부터 찾아줌 (맨뒤)
	
		//문자열 분리 : 여러개로 구성되어있는 문자열을 분리하고 싶을 때 split() 메소드 사용 
		String board = "번호,제목,내용,성명";
		String[] board1 = board.split(","); // ,기준으로 나누겠다.// 앞에는 반드시 string 배열로 들어가얌 
		System.out.println(board1[0]); // 0번째 : 번호
		System.out.println(board1[1]); // 1번째 : 제목 
		System.out.println(board1[2]); // 2번째 : 내용
		System.out.println(board1[3]); // 3번째 : 성명 
		
		String[] str1 = new String[3]; // 배열이 세군데가 만들어지는데 heap영역에 java를 만들고 세개가 같으니까
		str1[0] = "java";				// 따로따로 만들지 않고 같이 공유함.- 제일 일반적임 (그만큼 공간도 절약됨)
		str1[1] = "java";
		str1[2] = new String("java"); // new가 붙으면 같은거여도 무조건 새로만들어야함 
	
	}


}
