package ex02;

public class GradeExpr {
	
	private int[] jumsu; // 이거는 GradeTest에 있는 14번을 가지고 있음 
	
	
	public GradeExpr(int[] jumsu) {
		this.jumsu = jumsu;
 	}
	
	int getTotal() {
		int sum = 0;
		for(int i=0; i<jumsu.length; i++)
			sum += jumsu[i];
		
		return sum;
	}
	
	double getAverage() {
		return (double)getTotal()/jumsu.length; // double을 안붙이면 정수계산이라서 소수점 살리기 위해 double을 붙여줌(둘중에 어디에 붙여도 상관없음)
	}
	
	int getGoodScore() {
		int max = jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(max < jumsu[i])
				max = jumsu[i];
		}
		return max;
	}
	
	int getBadScore() {
		int min = jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(min > jumsu[i])
				min = jumsu[i];
		}
		return min;
	}
	
	
}