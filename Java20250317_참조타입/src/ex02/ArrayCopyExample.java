package ex02;

public class ArrayCopyExample {

	public static void main(String[] args) {
		
//	1.	int[] oldIntArray = new int[] {10,20,30,40,50};
//	2.	int[] oldIntArray2 = new int[5];
//		oldIntArray2[0] = 10; // 이렇게 두가지도 가능하다 
		
		int[] oldIntArray = {1,2,3};
		
		System.out.println(oldIntArray.length);
		
		int[] newIntArray = new int[6]; // 길이 6인 배열을 새로 생성 (원하는 배열의 크기를 숫자로 적어주면 됨)
		
		//배열복사
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i]; // 배열복사 
		}
		
		for(int i=0; i<newIntArray.length; i++)
			System.out.print(newIntArray[i] + " "); //문장이 하나면 {} 유무는 마음대로 
		
		System.out.println();
		
		int[] intArray = new int[10]; // 길이 10인 배열을 새로 생성 
		
		System.arraycopy(newIntArray, 0, intArray, 0, newIntArray.length); // 두번째 숫자 쓰는건 어디서부터 복사하겠니?(맨앞자리(0)부터 하겠다, 네번째자리 숫자는 몇번째 자리로 옮기겠니?, 마지막 자리는 길이(복사하는게 몇자리인지)
		for(int i=0; i<intArray.length; i++)								// 기본은 0, 0 이렇게씀 -> 배열은 모든걸 복사하는게 일반적
			System.out.print(intArray[i] + " ");
		
		System.out.println();
//		향상된 for문 : 모든걸 바꿀 수는 없음. 적절하게 잘 사용해야지 
		for(int i : intArray) // intArray에 한칸한칸 순서대로 i값을 넣어준다. 
			System.out.print(i + " ");
}
	

}
