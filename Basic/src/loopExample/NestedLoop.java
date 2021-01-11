package loopExample;

public class NestedLoop {

	public static void main(String[] args) {

		//2X3
		//dan 기준으로 count를 돌림
		//count가 10이되면 빠져나오고 dan에 올라감 
		
//		===== for문 구구단 =======
//		int dan;
//		int count ;
//		
//		for(dan = 2; dan <= 9; dan++) {
//			
//			for(count = 1; count <=9; count ++) {
//				
//				System.out.println(dan + "X" + count + "=" + dan * count);
//			}
//			
//			System.out.println();
//			
//		}
		
		int dan = 2;
		int count = 1;
		
		while(dan <= 9) {
			
			//10이이여서 dan에 들어오지 않음 
			//매번 초기화를 해줘야함 
			count = 1;
			
			while(count <= 9) {
				
				System.out.println(dan + "X" + count + "=" + dan * count);
				count++; //여기서 증감식을 적어쥼 ++ 10일때 빠져나가게 	
				
			}
			//이거 안하면 2단만 계속 무한루프 
			dan++;
			System.out.println();
		}
		
		
	}

}
