package loopExample;

public class CountinueExample {

	public static void main(String[] args) {

		
		//3의 배수만 출력 
		//1부터 100까지 
		
		int num;
		for(num = 1; num <= 100; num++) {
			
			//3의 배수 특징
			//:3으로 나눴을때 나머지가 0일때 
			if((num % 3) != 0) continue;
				System.out.println(num);
				
			
		}
	}

}
