package ex04;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")  // 0번째 자리에 ABC를 추가하겠다. 
//				.delete(3, 4)
				.toString();
		
		System.out.println(data);
				
		
		String data2 = new StringBuilder() 
				.append("DEF")
				.insert(0, "ABC")  // 0번째 자리에 ABC를 추가하겠다. 
				.delete(3, 5) // 3번째 위치부터 5번째 전까지 지우겠다. (3번째, 4번째 지우기)
				.toString();
		
		System.out.println(data2);
		
// 		StringBuffer data3 = new StringBuffer() // 이렇게 쓰고 toString안쓰는걸 더 많이쓴다. 
		String data3 = new StringBuffer() // 기능적으로는 StringBuilder랑 비슷한 기능 
				.append("DEF")			//두개는 "안전성"의 차이가 있는데 Buffer가 더 안전하게 사용가능 
				.insert(0, "ABC")  
				.delete(3, 5) 
				.toString();
		
		System.out.println(data3);
		
		
	}

}
