package ex04;

public class Friend extends Person {

	private String phoneNum;
	private String email;
	
	public Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getlnfo() {
	return super.getlnfo() + "\t" + phoneNum + "\t" + email;
	}
	
	
}


