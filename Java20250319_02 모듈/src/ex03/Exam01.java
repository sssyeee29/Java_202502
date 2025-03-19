package ex03;
/*def is_even(n):
	  numbers = [ ]
	  for i in n:
	    if i % 2 == 0:
	      numbers.append(i)
	  return numbers

	numbers = [1,2,3,4,5,6,7,8,9,10]

	result = is_even(numbers)
	print(result)
	*/

import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		int [] arr = is_even(numbers);
		
//		for(int i : arr)
//			System.out.print(i + " ");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(numbers));
	}
	
	static int[] is_even(int[] n) {
		int count = 0;
		
		//짝수 갯수 구하기 
		for(int i : n) {
			if(i%2==0)
				count++;
		}
		
		int[] arr = new int[count];
		int index = 0;
		
		for(int i : n) {
			if(i%2==0) { // 홀수의 합만 구할댄 0을 1로 바꿔주면 됨 
				arr[index] = i;
			index++;
			
			}
		}
		
		return arr;
	}

}
