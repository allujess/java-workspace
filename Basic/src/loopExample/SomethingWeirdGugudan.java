package loopExample;

public class SomethingWeirdGugudan {

	public static void main(String[] args) {

		int dan;
		int count;
		
		for(dan = 2; dan <= 9; dan++) {
			
			//짝수단만출력 
			//짝수단이 아니면 countine
			if((dan % 2) != 0) continue;
			
			for(count = 1; count <= 9; count++) {
				
				//breakㅇ는 자기를 감싼 블럭 for문만 빠져나감 	
			
				if(count > dan) break;
				
				System.out.println(dan + "X" + count +"=" + dan * count);
				
			}
			
			System.out.println();
			
		}
		
	}

}
