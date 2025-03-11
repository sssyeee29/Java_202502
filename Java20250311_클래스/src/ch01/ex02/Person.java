package ch01.ex02;

/*
 * 사람 클래스
 * 사람 특징 - name, age, height, weight, ....
 * 사람 동작 - run, sleep, eat, study, work, ....
 * 
 * 
 * 간추려 내는 과정을 추상화
 */
public class Person {

	private String name;
	private int age;
	
	void run() {
		System.out.println("run.......");
	}
	
	void eat() {
		System.out.println("eat.......");
		
	}
}
