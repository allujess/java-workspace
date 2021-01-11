package loopExample;

public class BreakExample {

	public static void main(String[] args) {

		
		//100이 넘는 순간이 언제냐!!
		
		int sum = 0; 
		int num ;
		
		for(num = 1;  ; num++) {
			
			sum+= num;
			
			//for문의 조건식을 없애고 여기다가 if로 따로 써서 break으로 빠져나오게도 할 수 있음
			//break은 조건이 매치가됬을때 빠져나오는게 break 	
			if(sum >= 100) break; 
			
		}
		
		System.out.println(sum);
		System.out.println(num);
		
	}

}
