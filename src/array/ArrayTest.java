package array;

import com.sun.org.apache.xpath.internal.operations.Plus;

public class ArrayTest {
	
	public static void main(String[] args) {
		

		//기본자료형 	4byte
		//초기화 선언과 동시에하기 
//		int[] arr;
//		arr = new int[] {1,2,3};
		
//		int[] arr;
//		arr = new int[] {1,2,3,4,5,6,7,8,9,10};
//		
//		for(arr < 0; arr <=10; arr++) {
//			
//		}
		
		
		int[] arr = new int[10];
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++ , num++) {
			
			System.out.println(arr[i]);
			
			arr[i] = num;
		}
		
		for(int i = 0; i <arr.length; i++) {
			total += arr[i];
			System.out.println(total);
			//System.out.println(arr[i]);
		}
		
		
		
	}

}
