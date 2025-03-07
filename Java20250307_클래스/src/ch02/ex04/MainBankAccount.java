package ch02.ex04;

public class MainBankAccount {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("홍길동", 10000); //객체생성
		
		b1.deposit(10000); // 만원 입금하니까 잔액은 2만원 
		b1.withdraw(1000000); //잔고는 1만원밖에 없는데 100만원을 인출했다고 가정 // 잔액부족으로 처리안됨
		b1.withdraw(2000);
		
		System.out.println(b1.getBalance());
	}

}
