package loopExample;

public class WhileExample {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0; //더해지는 값 
		
		while (num <= 10) { //조건이 true일때까지 수행 	
			
			sum += num; //sum 에 num을 더함 	
			num++; //1부터 10까지 더할때 11일때 빠져나감 	
			
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}
