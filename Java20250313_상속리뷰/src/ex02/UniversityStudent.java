package ex02;

public class UniversityStudent extends Student {
	
	private String major; //전공 
	
	UniversityStudent() {}
	
	UniversityStudent(String name, int age, String schoolName, int grade, String major) {
		super(name, age, schoolName, grade);
		this.major = major;
	}
	void registerCourse() {} //수강신청 
	
	@Override
	public String toString() {
		return "전공은 " + major + "입니다.";
	}
	
	@Override // Person에 있는 메소드를 재정의했다. 
	void introduce() {
		System.out.println("안녕하세요. 저는 " + major + "전공하고 있는 " + getName() + "입니다.");
	}
}
