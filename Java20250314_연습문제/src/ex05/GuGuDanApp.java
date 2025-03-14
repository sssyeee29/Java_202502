package ex05;

public class GuGuDanApp {

	public static void main(String[] args) {
		
		//1~20 난수 발생
		int dan = (int)(Math.random()*20)+1;
		int number = (int)(Math.random()*20)+1;

		System.out.println(dan); // 작동하는지 확인 
		System.out.println(number); // 작동하는지 확인
		
		/*
		 * if(dan <= 9) {
		 * if(number<=9) {
		 * GuGuDanExpr expr = new GuGuDanExpr(dan, number);
		 * expr.printPart();
		 * }else { 
		 * GuGuDanExpr expr = new GuGuDanExpr(dan);
		 * expr.printPart();
		 * }
		 * else {
		 * GuGuDanExpr.printAll();
		 * }
		 */
		// 1번 문제
		if((dan>=1 && dan<=9) && (number>=1 && number<=9)){ // if(dan <=9 && number<=9)
			GuGuDanExpr expr = new GuGuDanExpr(dan, number);
			expr.printPart();
			
		}else if((dan>=1 && dan<=9) && number>=10) { // if(dan <=9 && number >=10)
			GuGuDanExpr expr = new GuGuDanExpr(dan);
			expr.printPart();
		}else if(dan>=10) {
			GuGuDanExpr.printAll(); //static 메서드를 호출하는거니까 다음꺼는 안만든다 
		}
	}

}
