package ch01.ex07;

public class Account { //싱글톤패턴
	
	private int balance; 

	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	private static Account ac = new Account(); // 무조건 private
	
	private Account() { // 무조건 private
		
	}
	
	static Account getInstance() { //ac의 참조변수는 Account라서 반환타입도 Account							
		return ac; 					//public이거나 default 여야함 
	}
	void setBalance(int balance) {
		//if(MIN_BALANCE <= balance <= MAX_BALANCE) >> 이렇게 쓰면 안됨
		
//		if(MIN_BALANCE <= balance && balance <= MAX_BALANCE) >> 이렇게 쓰면 안됨(변수가 오른쪽에 있는게 일반적)
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
		this.balance = balance;
	}
	
	int getBalance() {
		return balance;
	}

}
