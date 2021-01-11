package ifExample;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {

		//break; case를 빠져나간다는 의미 
		//반복문에서도 사용함 ->중가로를 빠져나가라 break가 없으면case들을 다 수행함 
		//조건에 맞는 매치가 되는 부분부터 끝까지 사용됨 	
		
		Scanner scanner = new Scanner(System.in);
		
		int rank  = scanner.nextInt();
		
		char medalColor ;
		
		switch(rank) {
			
		case 1 : medalColor ='G';
		System.out.println("금메달입니다.");
			break;
		case 2 : medalColor = 'S';
		System.out.println("은메달입니다.");
			break;
		case 3 : medalColor ='B';
		System.out.println("동메달입니다.");
			break;
		
		default : medalColor = 'A';
		}
		System.out.println(rank + "의 메달은" + medalColor + " 입니다."); 
		
		
	}

}
