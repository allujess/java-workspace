package array;

public class ArrayCopy {

	public static void main(String[] args) {

		//기본자료형 복사 
		
		//int는 4바이트 20바이트 
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {1, 2, 3, 4, 5};
		
		//한곳에서 다른 array로 복사할때 
		//어디서 몇번째 위치 몇번째부터 몇개를 
		System.arraycopy(arr1, 3, arr2, 1, 2);
		
		for(int i = 0; i <arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}

}
