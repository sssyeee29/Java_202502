package ch01.ex09;

public class EqualExample {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10; 	
		
		String str1 = "korea";
		String str2 = "korea";
		
		System.out.println(num1 == num2); //num2는 num1에서 이미 생성된 korea를 같이써서 같은 값으로 출력
//		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2)); // 문자를 쓸땐 이렇게 써야함 14번처럼 안쓰고
		
		String str3 = new String("korea"); // 위에 10번, 11번에서 이미 썼어도 'new' 붙여주면 무조건 새로 만든다
		String str4 = new String("korea");
		
//		System.out.println(str3);
//		System.out.println(str4);
//		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4)); 
		
		System.out.println(str1.equals(str4)); 

		System.out.println(  (5>2) ^ (3>1)   );
		System.out.println(  (5>2) ^ (3<1)   );
		System.out.println(  (5<2) ^ (3>1)   );
		System.out.println(  (5<2) ^ (3<1)   );
		
		System.out.println(  !(5<2) );
		
	}

}
