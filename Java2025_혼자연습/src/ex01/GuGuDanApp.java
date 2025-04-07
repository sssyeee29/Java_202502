package ex01;


public class GuGuDanApp {

	public static void main(String[] args) {

		int dan = (int)(Math.random()*20)+1;
		int number = (int)(Math.random()*20)+1;
		
		System.out.println(dan);
		System.out.println(number);

		if((dan>=1 && dan<=9) && (number>=1 && number<=9)){ 
			GuGuDanExpr expr = new GuGuDanExpr(dan, number);
			expr.printPart();
			
		}else if((dan>=1 && dan<=9) && number>=10) { 
			GuGuDanExpr expr = new GuGuDanExpr(dan);
			expr.printPart();
		}else if(dan>=10) {
			GuGuDanExpr.printAll();  
		}
	}

}
