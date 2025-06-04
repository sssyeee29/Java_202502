package ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPractice {

	public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6); //1,2,3,4,5,6 이렇게 각각 배열이 만들어짐 
        
        // 1. 짝수만 필터링											//정수값이 0이면 true 아니면 false
        List<Integer> evenNumbers = filterEvenNumbers(numbers,  num -> num%2 == 0 );
        
        for(int i : evenNumbers)
        	System.out.print(i  + " ");
        System.out.println("\n-------------------------------");
       
        // 2. 짝수의 제곱 구하기
        List<Integer> squaredNumbers = map(numbers,	n ->  n*n );
        
        for(int i : squaredNumbers)
        	System.out.print(i  + " ");
        System.out.println("\n-------------------------------");
        
        // 3. 결과 출력
        forEach(numbers,  n-> System.out.print(n + " "));
    }
	
	// 1.짝수만 필터링하는 메소드
    public static List<Integer> filterEvenNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
    	
    	List<Integer> list= new ArrayList<Integer>();
    	
    	for(int n : numbers) { //numbers에 list가 들어가있음. num를 2로 나눠서 0이 되는값을 출력함 
    		if(predicate.test(n)) {	//1%2 != 0  // 2,4,6의 값은 true가 되니까 if문을 타서 list.add(n)해서 list에 추가해서 결과 출력
    			list.add(n);
    		}
    	}
    	return list; //return list하면 evenNumbers가 받아서 2,4,6이 완성됨 
    }
    
	// 2.숫자를 제곱하는 메소드													
    public static List<Integer> map(List<Integer> numbers, Function<Integer, Integer> function) {
    	List<Integer> list= new ArrayList<Integer>();
    	
    	for(int i : numbers) {
    		list.add(  function.apply(i) );
    	}
    	return list;
    }

	
	// 3.숫자를 출력하는 메소드								//입력값만 있고, 반환타잉이 없음(return없음), 코드가 간결해짐
    public static void forEach(List<Integer> numbers, Consumer<Integer> consumer) {
    	for(int i : numbers)
    		consumer.accept(i); //여기서 함수 호출되면, 위에 3에 해당하는게 실행됨 
    }
    

    



}