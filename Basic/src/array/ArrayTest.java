package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[10];
		
		int total = 0;

		//arr.length를 조건으할때 [10]위에서 방의 길이를 선언해줌 
		for (int i = 0, num = 1; i < arr.length; i++, num++) {

			arr[i] = num;
		}

		// arr.length 작다를 많이 씀
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];

			System.out.println(total);
		}

		System.out.println("합 :" + total);

		
		//유효한 값을 가져오기 
		double[] dArr = new double[5];

		int count = 0;
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1;  count++;
		dArr[2] = 3.1;  count++;
		
		
		//double하면 곲한 값이 나옴 
		double mtotal = 1; 
		
		//i는 지역변수가 아니여서 계속 사용할 수 있음 scope가 한정되어있음 
		//count가 총 length라고하면 5에 비해 3개 인얘들을 초기화 시켜 값을 가져옴 
		for(int i = 0; i < count; i++) {
			mtotal *= dArr[i];
					
		}
		//0이 나옴 요소가 총 5개여서 2개는 0.0으로 초기화되서 값이 0이됨 
		System.out.println(mtotal);
		

	}

}





