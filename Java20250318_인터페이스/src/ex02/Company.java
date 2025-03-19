package ex02;

public class Company {

	public static void main(String[] args) {
		//Employee 배열에 객체들을 생성하여 저장한다. 
		
	/*  Employee[] employees = new Employee[5]; //그냥 임의로 5잡음 
		employees[0] = new Secretary("Duke", 1, "secretary", 800);
		employees[1] = new Secretary("Tuxi", 2, "sales", 1200); 
		
		int[] arr = new int[5];
		arr[0] =10;
		arr[1] =20;
		int[] arr2 = new int[] {10,20,30};
		int[] arr3 = {10,20,30,40};
		*/
		
		Employee[] employees = {
				new Secretary("Duke", 1, "secretary", 800),
				new Secretary("Tuxi", 2, "sales", 1200)
		};
		
		//printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보를 출력한다.
		System.out.println("name\t department\t salary\t extra pay");
		System.out.println("------------------------------------------------------------------");
		Company.printEmployee(employees, false); // 이걸 써줌으로 duke에는 tax가 안나옴 
		
		// 이 때는 세금을 출력하지 않는다.
		// 모든 직원에게 인센티브로 100씩 지급한다.(직원에 따라 적용되는 인센티브 금액은 다르다.
		for(Employee emp : employees) {
			if(emp instanceof Bonus) { //emp가 참조대상이 Bonus를 구현한 객체니?
//				Bonus bonus = (Bonus)emp; 35번 36번은 37번 한줄로 가능 
//				bonus.incentive(100);
				((Bonus)emp).incentive(100);
			}
		}
		
		System.out.println();
		System.out.println();
		// printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보 와 세금을 출력한다
		System.out.println("name\t department\t salary\t tax\t extra pay");
		System.out.println("------------------------------------------------------------------");
		Company.printEmployee(employees, true); //27번이랑 44번은 47번에 static 붙어서 새로운 객체 안만들고 바로 씀 
	}	
	
	public static void printEmployee(Employee[] emp, boolean isTax) {
		// 객체의 정보를 출력한다.(실행 결과를 참조)
		// isTax 의 참/거짓 여부에 따라서 텍스 출력 여부를 결정하여 처리한다
	/*
	 * for(int i=0; i<emp.length; i++) {
			System.out.println(
			emp[i].getName() + "\t\t" +  emp[i].getDepartment() + "\t\t" + 
			emp[i].getSalary() 
					);
		}
		*/
	 
		for(Employee e : emp) {
			System.out.printf("%-7s%-10s%10d",
					e.getName(),e.getDepartment(),e.getSalary() );
			
			if(isTax) { //isTax가 true면 출력해라
				System.out.printf("%10.1f", e.tax());
			}
			if(e instanceof Sales) {
			//	Sales s = (Sales)e;
			//	System.out.printf("%18.1f" , s.getExtraPay());
				System.out.printf("%10.1f" , ((Sales)e).getExtraPay());
			}
			System.out.println();
		}
		
	}
	
	

}
