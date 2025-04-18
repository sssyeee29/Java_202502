package ex05;

public class Multiplication {
	
	private int dan; // 구구단의 "단"
	private int number; // 곱해질 숫자 1~9
	
	public Multiplication() {}
	
	public Multiplication(int dan) {
		this.dan = dan;
	}

	public Multiplication(int dan, int number) {
		this.dan = dan;
		this.number = number;
	}
	
	void printPart() {
		if(number == 0) {
			System.out.print(dan + "단 : ");
			for(int n=1; n<=9; n++) {
				System.out.print(dan + "*" + n + "=" + (dan*n) + "\t");
			}
			System.out.println();
		}else {
			System.out.println(dan + "*" + number + " = " + dan*number );
		}
	}


}
