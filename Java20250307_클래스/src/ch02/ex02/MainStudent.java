package ch02.ex02;

public class MainStudent {

	public static void main(String[] args) {

		//1. Student 객체생성하면서 이름(홍길동), 학년(3), 나이(20) 입력
		//11~14
		Student student = new Student("홍길동", 3, 20);
		
		//2. printInfo() 메소드 호출
		//33~36
		student.printInfo();
		
		//3. 이름을 이순신으로 변경
		//17,18
		student.setName("이순신");
		
		//4. 변경된 이름만 출력
		//21,22
		String name = student.getName();
		System.out.println(name);
		
		//5. 학년 5로 변경
		//25,26
		student.setGrade(5);
		
		//6. 변경된 학년만 출력
		//29,30
		System.out.println(student.getGrade());
	}
	
	

}
