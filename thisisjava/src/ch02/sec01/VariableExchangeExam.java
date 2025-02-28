package ch02.sec01;

public class VariableExchangeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		
		System.out.println("before : ");
		System.out.println("a = " + a +", " + "b = " + b);
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("after : ");
		System.out.println("a = " + a +", " + "b = " + b);
		
				
	 
		
	}

}
