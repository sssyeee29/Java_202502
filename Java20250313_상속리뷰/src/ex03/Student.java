package ex03;

public class Student extends Person {
	
	private String schoolName;
	private int grade; //학년
	
	Student() {}
	
	Student(String name, int age, String schoolName, int grade) {
		super(name, age);
		this.schoolName = schoolName;
		this.grade = grade;
		
	}
	void study() {
		System.out.println("study(...)");
	}
	
	@Override // 이렇게 직접써서 확인하거나 source눌러서 toString 클릭하면 알아서 적어줌 
	public String toString() {
		return schoolName + "," + grade + "학년입니다.";
	}
	
	@Override // Person에 있는 메소드를 재정의했다 
	void introduce() {
		System.out.println("안녕하세요. 저는 " + schoolName + "에 다니는 " + grade + "학년 "
				+ getName() + " 입니다.");
	}
}