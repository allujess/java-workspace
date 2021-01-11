package loopExample;

public class ForExample {

	public static void main(String[] args) {

//		int count; //더해지는 값을 받는 변수 	
//		int sum = 0; //합칠꺼여서 반드시초기화
//		
//		for(count = 0; count < 10; count++) { //10번 횟수 
//			sum += count; //sum에다가 다 누적해주고 	
//		}
//		
//		//sum을 출력 	
//		System.out.println(sum);
		
		//주로 이렇게 해줌 
		int count = 1;
		int sum = 0;
		
		for(int i = 0; i < 10; i++) { //10번돈다 작다라는 <이런걸 많이쓰지 <=이거는 별로 그닥 오에 
			sum += count;
			count ++; //1부터 돌리기 	
		}
		
		System.out.println(sum);
		
	}

}
