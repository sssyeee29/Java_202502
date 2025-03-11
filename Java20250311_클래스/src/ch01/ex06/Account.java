package ch01.ex06;

public class Account {
	
	private int balance; 

	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
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
