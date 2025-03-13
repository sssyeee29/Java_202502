package ex04;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p2 = new UniversityStudent();
		UniversityStudent u2 = (UniversityStudent)p2;
		u2.registerCourse(); 
		
		Person p1 = new Person();
		Student s1 =  new Student();
		UniversityStudent u1 = new UniversityStudent();
		
		method(u1);
		method(s1); 
		method(p1);
		
	}
	
	static void method(Person p) { // person은 세개에 다 포함되어있으니까
		
		if(p instanceof UniversityStudent) {
			UniversityStudent u = (UniversityStudent)p;
			((UniversityStudent)p).sleep();
			((UniversityStudent)p).study();
			((UniversityStudent)p).registerCourse();
		}else if(p instanceof Student) { //객체타입확인 = a instanceof b - a에 전달된 객체가 b맞니? 
			((Student)p).sleep(); //객체생성안하고 바로 쓸 수 있음 
			((Student)p).study();
		}else {
			p.sleep();
		}
		System.out.println("--------------------------");
		
	}

}
